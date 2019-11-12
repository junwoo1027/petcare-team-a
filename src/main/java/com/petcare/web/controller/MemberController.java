package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.MemberVO;
import com.petcare.web.service.MemberService;


@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService MemberService;
	
	@GetMapping("/normal")
	public String normal() {
		return "normalRegister";
	}
	
	@PostMapping("/user")
	public String register(MemberVO memberVO) {
		MemberService.register(memberVO);
		return "redirect:/index";
	}
	
}