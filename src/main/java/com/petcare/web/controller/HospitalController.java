package com.petcare.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petcare.web.domain.HospitalVO;
import com.petcare.web.service.HospitalService;

@Controller
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private HospitalService hospitalService;
	
	//병원 정보
	@GetMapping("/get")
	public void get(@RequestParam("hospitalId") String hospitalId, Model model) {
		model.addAttribute("hospital", hospitalService.view(hospitalId));
	}
	
	//병원 전체 리스트
	@GetMapping("/list")
	public void hospitalList(Model model) {
		//new ArrayList?
		List<HospitalVO> list = new ArrayList<HospitalVO>();
		list = hospitalService.list();
		//all?
		model.addAttribute("list",list);
	}
	
	//병원 검색
	@GetMapping("/search")
	public String hospitalSearch(Model model, String hospitalName) {
		List<HospitalVO> search = hospitalService.search(hospitalName);
		model.addAttribute("search",search);
		return "list";
	}
	
}
