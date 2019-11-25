package com.petcare.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.HospitalVO;
import com.petcare.web.service.HospitalService;

@Controller
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/list")
	public String hospitalList(Model model) {
		//new ArrayList
		ArrayList<HospitalVO> list = new ArrayList<HospitalVO>();
		list = hospitalService.list();
		System.out.println("여기요"+list);
		model.addAllAttributes(list);
		System.out.println("저기요"+list);
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
	
}
