package com.petcare.web.controller;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.HospitalVO;
import com.petcare.web.service.HospitalService;

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
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/list")
	public String hospitalList(Model model) {
		//new ArrayList?
		List<HospitalVO> list = new ArrayList<HospitalVO>();
		list = hospitalService.list();
		//all?
		model.addAttribute("list",list);
		return "hospitalList";
	}
	
	@GetMapping("/search")
	public String hospitalSearch(Model model, String hospitalName) {
		List<HospitalVO> search = hospitalService.search(hospitalName);
		model.addAttribute("search",search);
		return "hospitalList";
	}
	
	@GetMapping("/view")
	public String hospitalView(Model model, String hospitalId) {
		HospitalVO view = hospitalService.view(hospitalId);
		model.addAttribute("view",view);
		return "hospitalView";
	}
	
}
