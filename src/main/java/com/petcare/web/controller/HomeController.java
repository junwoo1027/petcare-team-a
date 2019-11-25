package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.petcare.web.domain.UserVO;
import com.petcare.web.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private MemberService MemberService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String home() {		
		return "index";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("user", new UserVO());
		return "loginForm";
	}
	
	@PostMapping("/loginPro")
	public String loginProcess(@ModelAttribute("user") UserVO user, Model model) {
		UserVO saved = MemberService.loginPro(user);
		if (saved != null) {
			model.addAttribute("user", saved);
			return "redirect:/index";
		}
		return "redirect:/login";
	}
	
	@GetMapping("/logout")
	public String logout() {
		return "redirect:/index";
	}
	
	@GetMapping("/select")
	public String registerS() {
		return "user/registerSelect";
	}
	
}
