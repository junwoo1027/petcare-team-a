package com.petcare.web.mapper;

import java.util.List;
import com.petcare.web.domain.HospitalVo;

public interface HospitalMapper {
	
	public List<HospitalVO> listHospital(); //병원 전체 리스트
	public List<HospitalVO> searchHospital(String hospitalName); //병원 검색 리스트
	public HospitalVO viewHospital(String hospitalId); //병원 정보

