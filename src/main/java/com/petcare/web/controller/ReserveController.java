package com.petcare.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.service.ReserveService;

@Controller
@RequestMapping("/reserve")
public class ReserveController {

//	@Autowired
//	private ReserveService reserveService;

	@GetMapping("/reserveview")
	public String reserveview() {
		return "reserve/reserve";
	}
	
	
	
}
