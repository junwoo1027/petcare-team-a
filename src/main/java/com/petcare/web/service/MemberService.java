package com.petcare.web.service;

import com.petcare.web.domain.MemberVO;
import com.petcare.web.domain.UserVO;

public interface MemberService {
	//회원가입
	public void register(MemberVO memberVO);
	//아이디중복체크
	public int selectUserID(String userId);
	//이메일중복체크
	public int selectEmail(String email);
	//아이디중복체크
	public UserVO getUser(String userId);
	//이메일중복체크
	public UserVO getEmail(String userEmail);
	//로그인
	public UserVO loginPro(UserVO user);
}
