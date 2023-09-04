package org.green.controller;

import org.green.domain.MemberDTO;
import org.green.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member/*")
public class MemberController {
	@Setter(onMethod_ = {@Autowired})
	private MemberService service;
	
	// 목록 
	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", service.getList());
	}

	// 등록
	@GetMapping("/register")
	public void register() {
		
	}
	
	//주의 - input의 name 값과 MemberDTO의 필드명이 일치해야함 (대소문자 구분)
	@PostMapping("/register")
	public String register(MemberDTO mto) {
		log.info("=============================");
		log.info("등록 : " + mto);
		log.info("=============================");
		
		service.register(mto);
		
		return "redirect:/member/list";
	}

}
