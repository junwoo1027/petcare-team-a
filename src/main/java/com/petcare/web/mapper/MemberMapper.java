package com.petcare.web.mapper;


import com.petcare.web.domain.MemberVO;

public interface MemberMapper {
	public void register(MemberVO memberVO);	//회원가입
	public String selectUserID(String userId); //아이디 중복체크
	public String selectEmail(String email); //이메일 중복체크
}
