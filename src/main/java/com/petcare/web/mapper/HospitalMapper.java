package com.petcare.web.mapper;

import java.util.ArrayList;

import com.petcare.web.domain.HospitalVO;

public interface HospitalMapper {
	
	public ArrayList<HospitalVO> listHospital(); //병원 전체 리스트
	
	public ArrayList<HospitalVO> searchHospital(String hospitalName); //병원 검색 리스트
	
	public HospitalVO viewHospital(String hospitalId); //병원 정보
	
}

