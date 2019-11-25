package com.petcare.web.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.Hospital;
import com.petcare.web.domain.HospitalVO;
import com.petcare.web.domain.character;
import com.petcare.web.service.HospitalService;

@Controller
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/list")
	public String hospitalList(Model model) {
		ArrayList<HospitalVO> list = hospitalService.list();
		model.addAttribute("list",list);
		//all? attribute?
		return "hospitalList";
	}
	
	@GetMapping("/search")
	public String hospitalSearch(Model model, String hospitalName) {
		ArrayList<HospitalVO> search = hospitalService.search(hospitalName);
		model.addAttribute("search",search);
		//all? attribute?
		return "hospitalList";
	}
	
	@GetMapping("/view")
	public String hospitalView(Model model, String hospitalId) {
		HospitalVO view = hospitalService.view(hospitalId);
		model.addAttribute("view",view);
		return "hospitalView";
	}
	
	@PostMapping("/Join")
	public String register(Hospital hospital, character character, Redirect rttr, HttpServletRequest request) {
		return "redirect:/index";
	}
}
