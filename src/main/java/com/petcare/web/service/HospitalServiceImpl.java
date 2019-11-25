package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.HospitalVo;
import com.petcare.web.mapper.HospitalMapper;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalMapper mapper;
	
	@Override
	public HospitalVo get(String hospitalId) {
		return mapper.read(hospitalId);
	}

}
