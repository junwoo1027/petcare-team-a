package com.petcare.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.PetVo;
import com.petcare.web.domain.ReservVO;
import com.petcare.web.mapper.ReservMapper;

@Service
public class ReservService {
	
	@Autowired
	private ReservMapper reservMapper;

	public int reservationForm(ReservVO reservoVO) {
		
		int rgstYn = 0;

		rgstYn = reservMapper.reservationForm(reservoVO);
		
		return rgstYn;
		
	}

	public List<PetVo> getPets(String userId) {
		
		List<PetVo> pets = reservMapper.getPets(userId);
		
		return pets;
	}

}
