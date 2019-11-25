package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petcare.web.domain.Criteria;
import com.petcare.web.domain.ReviewVo;
import com.petcare.web.service.HospitalService;
import com.petcare.web.service.ReviewService;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService service;
	
	@GetMapping("/get")
	public void get(@RequestParam("hospitalid") String hospitalId, Model model) {
		model.addAttribute("hospital", service.get(hospitalId));
	}
}