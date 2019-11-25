package com.petcare.web.mapper;


import com.petcare.web.domain.UserVO;

public interface MemberMapper {
	public void register(UserVO user);	//회원가입
	public String selectUserID(String userId); //아이디 중복체크(Juery Validator)
	public String selectEmail(String email); //이메일 중복체크(Juery Validator)
	public UserVO getUser(String userId); //아이디 중복체크(Spring Validator)
	public UserVO getEmail(String userEmail); //이메일 중복체크(Spring Validator)
	public UserVO loginPro(UserVO user); 	//로그인
}
