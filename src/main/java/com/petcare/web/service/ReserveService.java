package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.petcare.web.mapper.ReserveMapper;

public class ReserveService {

	@Autowired
	private ReserveMapper reserveMapper;
	
	public String getTime() {
		
		return reserveMapper.getTime();
	}
	
}
