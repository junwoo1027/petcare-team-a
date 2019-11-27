package com.petcare.web.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petcare.web.domain.PetVO;
import com.petcare.web.domain.ReservVO;
import com.petcare.web.domain.UserVO;
import com.petcare.web.service.ReservService;

@Controller
@RequestMapping("/reserv")
public class ReservController {

	@Autowired
	private ReservService reservService;
	
	//예약 홈페이지 가기
	@GetMapping("/go_reservation")
	public String goReservaion(HttpSession session, Model model) {
		
		//사용자 동물 값 갖고오기
		UserVO user = (UserVO) session.getAttribute("user");
		user.getUserId();
		
		List<PetVO> pets = new ArrayList<PetVO>();
		pets = reservService.getPets(user.getUserId());
		System.out.println(pets);
		
		model.addAttribute("pets", pets);
		
		return "reservation";
	}
	
	//예약진행
	@PostMapping("/reservationForm")
	public String reservationForm(@ModelAttribute ReservVO reservoVO) {
		System.out.println(reservoVO+"@@@@@@@@@@@@@@@");
		reservoVO.setPetNo("3");
		reservoVO.setUserId("hannncrystal");
		reservoVO.setHospitalId("hanhosp");
		reservService.reservationForm(reservoVO);
		
		return "redirect:/";
	}
}
