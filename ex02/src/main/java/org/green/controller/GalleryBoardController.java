package org.green.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.green.domain.GalleryBoardVO;
import org.green.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/galleryboard/*")
// 의존성 주입
@AllArgsConstructor
public class GalleryBoardController {
	@Setter(onMethod_ = {@Autowired})
	private GalleryService service;
	
	@GetMapping("/list")
	// Model 타입은 view로 데이터를 전달 (자동)
	public void list(Model model) {
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/register") 
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String postregister(GalleryBoardVO gvo, RedirectAttributes rttr) {
		log.info("==================================================");
		log.info("register : " + gvo);
		log.info("==================================================");
		
		service.register(gvo);
		rttr.addAttribute("result", gvo.getGno());
		return "redirect:/galleryboard/list";
		
	}
	
	// 게시글 조회 - 상세보기 요청	 // 수정하기 요청
	@GetMapping({"/view","/modify"})
	public void get(int gno, Model model) {
		model.addAttribute("board", service.get(gno));
	}
	
	// 게시글 삭제 요청 처리 
	@PostMapping("/remove")
	public String remove(int gno, String uploadPath, String fileName) {
		deleteFile(uploadPath, fileName);
		service.remove(gno);
		return "redirect:/galleryboard/list";
	}
	
	// 게시글 수정 요청 처리 
	@PostMapping("/modify")
	public String modify(GalleryBoardVO gvo) {
		log.info("===================수정======================");		
		log.info(gvo);		
		log.info("===================수정======================");
		service.modify(gvo);
		return "redirect:/galleryboard/list";
	}

	// 파일 삭제 메소드 
	private void deleteFile(String uploadPath, String fileName) {
		Path file = Paths.get("c:\\upload\\" + uploadPath + "\\" + fileName);
		try {
			Files.delete(file);
			Path thumbNail = Paths.get("c:\\upload\\" + uploadPath + "\\s_" + fileName);
			Files.delete(thumbNail);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
