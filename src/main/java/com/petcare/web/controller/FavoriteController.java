package com.petcare.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.petcare.web.domain.FavoriteVO;
import com.petcare.web.domain.Hospital;
import com.petcare.web.domain.UserVO;
import com.petcare.web.service.FavoriteService;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {
	@Autowired
	private FavoriteService favoriteService;

	//즐겨찾기 등록
	@Transactional
	@GetMapping("/register")
	public String favoriteInsert(HttpSession session, FavoriteVO favorite) {
		UserVO user = (UserVO) session.getAttribute("user");
		user.getUserId();
		favorite.getHospitalId();
		favorite.setUserId(user.getUserId());
		favoriteService.register(favorite);
		return "favorite/favorite";
	}
	
	//즐겨찾기 삭제
	@Transactional
	@GetMapping("/delete")
	public String favoriteDelete(HttpSession session, int favoriteNo) {
		favoriteService.delete(favoriteNo);
		return "favorite/favorite";
	}
	
	//환자용 즐겨찾기
	@GetMapping("/foruser")
	public String favoriteForUser(HttpSession session, Model model){
		UserVO user = (UserVO) session.getAttribute("user");
		List<String> hospitals = favoriteService.selectForUser(user.getUserId());
		model.addAttribute("hospitals", hospitals);
		System.out.println(hospitals);
		//model.addAllAttributes(hospitals);
		return "favorite/favorite";

	}
	
	//병원용 즐겨찾기
	@GetMapping("/forhospital")
	public String favoriteForHospital(@RequestParam("hospitalId") String hospitalId){
		List<UserVO> result = new ArrayList<UserVO>();
		List<String> users = favoriteService.selectForHospital(hospitalId);
		return "favorite/favorite";
	
	}

}
