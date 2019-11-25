package com.petcare.web.mapper;

import com.petcare.web.domain.HospitalVo;
import java.util.ArrayList;

public interface HospitalMapper {
	
	public ArrayList<HospitalVO> listHospital(); //병원 전체 리스트
	public ArrayList<HospitalVO> searchHospital(String hospitalName); //병원 검색 리스트
	public HospitalVO viewHospital(String hospitalId); //병원 정보

