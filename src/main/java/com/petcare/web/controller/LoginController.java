package com.petcare.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.petcare.web.domain.Member;
import com.petcare.web.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/loginForm")
	public String loginForm(Model model) {
		model.addAttribute("member", new Member());
		
		return "loginForm";
	}
	
	@PostMapping("/loginProcess")
	public String loginProcess(@ModelAttribute Member member, Model model) {
		Member saved = memberService.getMember(member);
		if(saved != null) {
			model.addAttribute("member", saved);
			return "redirect:/index";
		}
		
		return "redirect:/loginForm";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";
	}

}
