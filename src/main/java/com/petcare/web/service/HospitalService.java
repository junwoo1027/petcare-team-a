package com.petcare.web.service;

import java.util.ArrayList;

import com.petcare.web.domain.HospitalVO;

public interface HospitalService {
	//병원 전체 리스트
	public ArrayList<HospitalVO> list();
	//병원 검색
	public ArrayList<HospitalVO> search(String hospitalName);
	//병원 보기
	public HospitalVO view(String hospitalId);
}
