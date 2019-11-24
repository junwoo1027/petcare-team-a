package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.service.HospitalService;

@Controller
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/list")
	public String hospitalList() {
		hospitalService.list();
		return "hospitalList";
	}//model 객체?
	
	@GetMapping("/search")
	public String hospitalSearch(String hospitalName) {
		hospitalService.search(hospitalName);
		return "hospitalList";
	}//model 객체?
	
	@GetMapping("/list")
	public String hospitalView(String hospitalId) {
		hospitalService.view(hospitalId);
		return "hospitalView";
	}//model 객체?
	
}
