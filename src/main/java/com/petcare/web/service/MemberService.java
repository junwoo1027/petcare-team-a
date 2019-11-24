package com.petcare.web.service;

import com.petcare.web.domain.MemberVO;

public interface MemberService {
	//회원가입
	public void register(MemberVO memberVO);
	//아이디중복체크
	public int selectUserID(String userId);
	//이메일중복체크
	public int selectEmail(String email);
}
