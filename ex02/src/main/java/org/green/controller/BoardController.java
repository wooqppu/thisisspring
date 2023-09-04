package org.green.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.green.domain.BoardAttachVO;
import org.green.domain.BoardVO;
import org.green.domain.Criteria;
import org.green.domain.PageDTO;
import org.green.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("board/*")
// 의존성 주입
@AllArgsConstructor
public class BoardController {
	private BoardService service;
	
	@GetMapping("/list2")
	public void list2(Criteria cri, Model model) {
		model.addAttribute("list", service.getList(cri));		
		int total = service.getTotal(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}

	// 게시글 리스트 	list?pageNum=1&amount=10
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		model.addAttribute("list", service.getList(cri));
		
		int total = service.getTotal(cri);
		// 임시로 200 넣어놨으나 나중에 전체 페이지 수(total)가 들어감 (페이징 과정)
		// model.addAttribute("pageMaker", new PageDTO(cri, 200));
		model.addAttribute("pageMaker", new PageDTO(cri, total));
	}
	
	// 게시글 등록 페이지 가기
	@GetMapping("/register")
	public void register() {
		
	}
	
	// 게시글 등록 처리 페이지
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {
		// RedirectAttributes : 등록 작업이 끝난 후 다시 목록 화면으로 이동하기 위함
		// 추가적으로 새롭게 등록한 게시물의 번호를 같이 전달하기 위해 사용
		
		log.info("==================================================");
		log.info("register : " + board);
		log.info("==================================================");
		
		service.register(board);
		rttr.addAttribute("result", board.getBno());
		return "redirect:/board/list";
		
	}
	
	// 게시글 1개 조회 
	@GetMapping({"/get", "/modify"})
	public void get(@RequestParam("bno") Long bno,
			@ModelAttribute("cri") Criteria cri, Model model) {
		log.info("get");
		model.addAttribute("board", service.get(bno));
	}

	// 수정 
	@PostMapping("/modify")
	public String modify(BoardVO board, @ModelAttribute("cri") Criteria cri, 
			RedirectAttributes rttr) {
		log.info("modify : " + board);
		if(service.modify(board)) {
			rttr.addAttribute("result", "수정");
		}
		
		rttr.addAttribute("pageNum", cri.getPageNum());
		rttr.addAttribute("amount", cri.getAmount());
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		
		return "redirect:/board/list";
	}
	
	// 삭제 요청 처리 
	@PostMapping("/remove")
	public String remove(Long bno, RedirectAttributes rttr) {
		log.info("remove : " + bno);
		
		List<BoardAttachVO> attachList = service.getAttachList(bno);
		
		if(service.remove(bno)) {
			// 파일 삭제	
			deleteFiles(attachList);
			
			rttr.addAttribute("result", "삭제");
		}
		return "redirect:/board/list";
	}
	
	// 특정한 게시글 번호의 첨부파일과 관련된 데이터를 json으로 반환하는 메소드 
	@GetMapping(value="/getAttachList", produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public ResponseEntity<List<BoardAttachVO>> getAttachList(Long bno) {
		return new ResponseEntity<>(service.getAttachList(bno), HttpStatus.OK);
	}
	
	// 파일 삭제 메소드 
	private void deleteFiles(List<BoardAttachVO> attachList) {
		if(attachList == null || attachList.size() == 0) {
			return;
		}
		attachList.forEach(attach->{
			Path file = Paths.get("C:\\upload\\" + attach.getUploadPath() + "\\" 
			+ attach.getUuid() + "_" + attach.getFileName());
			
			try {
				Files.deleteIfExists(file);
				
				// 이미지일 경우 썸네일 이미지도 삭제 
				if(Files.probeContentType(file).startsWith("image")) {
					Path thumbNail = Paths.get("C:\\upload\\" + attach.getUploadPath() + "\\s_" 
							+ attach.getUuid() + "_" + attach.getFileName());
					
					Files.delete(thumbNail);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
	}
}

