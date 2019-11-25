package com.petcare.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.HospitalVO;
import com.petcare.web.mapper.HospitalMapper;

@Service
public class HospitalServiceImpl implements HospitalService {
	@Autowired
	private HospitalMapper hospitalMapper;
	
	//병원 전체 리스트
	@Override
	public List<HospitalVO> list(){
		List<HospitalVO> result = hospitalMapper.listHospital();
		return result;
	};
	
	//병원 검색
	@Override
	public List<HospitalVO> search(String hospitalName){
		List<HospitalVO> result = hospitalMapper.searchHospital(hospitalName);
		return result;
	};
	
	//병원 보기
	@Override
	public HospitalVO view(String hospitalId) {
		HospitalVO result = hospitalMapper.viewHospital(hospitalId);
		return result;
	};
	
}
