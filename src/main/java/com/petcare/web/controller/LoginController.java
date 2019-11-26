package com.petcare.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.MemberVO;
import com.petcare.web.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
    private LoginService loginService;
	
	@GetMapping("/loginForm")
    public String loginForm(Model model) {
		model.addAttribute("member", new MemberVO());
        return "login/loginForm";
    }

    @PostMapping("/loginProcess")
    public String loginProcess(@ModelAttribute MemberVO member, Model model, HttpSession session, HttpServletRequest request) {
    	

		String userId = (String)session.getAttribute("member");
		member.setUserId(userId);

    	MemberVO saved = loginService.getCorrectMember(member);
        if (saved != null) {
            model.addAttribute("member", saved);
            return "redirect:/faq/faqList";
        }

        return "redirect:/login/loginForm";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/index";
    }
}