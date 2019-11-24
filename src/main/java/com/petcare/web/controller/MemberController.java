package com.petcare.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petcare.web.domain.MemberVO;
import com.petcare.web.service.MemberService;


@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService MemberService;
	
	@GetMapping("/login")
	public String login() {
		return "loginForm";
	}
	
	@GetMapping("/select")
	public String registerS() {
		return "user/registerSelect";
	}
	
	@GetMapping("/normal")
	public String normal() {
		return "user/normalRegister";
	}
	
	@PostMapping("/user")
	public String register(MemberVO memberVO) {
		MemberService.register(memberVO);
		return "redirect:/index";
	}
	
	@GetMapping("/hospital")
	public String hospital() {
		return "hospitalRegister";
	}
	
	@PostMapping("/check_id")
	@ResponseBody
	public void selectUserID(@RequestParam("userId") String userId, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		int count = MemberService.selectUserID(userId);
		if(count == 0) {
			out.print(true);
		}else if(count == 1) {
			out.print(false);
		}
	}
	
	@PostMapping("/check_email")
	@ResponseBody
	public void selectEmail(@RequestParam("email") String email, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		int count = MemberService.selectEmail(email);
		if(count == 0) {
			out.print(true);
		}else if(count == 1) {
			out.print(false);
		}
	}
}