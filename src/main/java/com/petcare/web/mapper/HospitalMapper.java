package com.petcare.web.mapper;

import java.util.List;

import com.petcare.web.domain.Codename;
import com.petcare.web.domain.Hospital;

public interface HospitalMapper {
	public List<String> listCodename(String hospitalId); //코드 네임 불러오기
	public List<Hospital> listHospital(); //병원 전체 리스트
	public List<Hospital> searchHospital(String hospitalName); //병원 검색 리스트
	public Hospital viewHospital(String hospitalId); //병원 정보
	public void register(Hospital hospital);	//병원 회원가입
	public void codeInsert (Codename codename);	//특성 삽입
	public String selectID(String id); //아이디 중복체크(Juery Validator)
	public String selectEmail(String email); //이메일 중복체크(Juery Validator)
	public Hospital loginPro2(Hospital hospitaluser);	//병원회원 로그인
}
