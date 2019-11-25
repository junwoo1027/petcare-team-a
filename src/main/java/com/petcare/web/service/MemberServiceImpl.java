package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.UserVO;
import com.petcare.web.mapper.MemberMapper;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	//회원가입
	@Override
	public void register(UserVO user) {
		memberMapper.register(user);
	}
	
	//아이디 중복체크
	@Override
	public int selectUserID(String userId) {
		String id = memberMapper.selectUserID(userId);
		if(id == null) {
			return 0;
		}else {
			return 1;
		}
	}
	
	//이메일 중복체크
	@Override
	public int selectEmail(String email) {
		String userEmail = memberMapper.selectEmail(email);
		if(userEmail == null) {
			return 0;			
		}else {
			return 1;
		}
	}
	
	//로그인
	@Override
	public UserVO getUser(String userId) {
		return memberMapper.getUser(userId);
	}

	//이메일 중복체크
	@Override
	public UserVO getEmail(String userEmail) {
		return memberMapper.getEmail(userEmail);
	}

	@Override
	public UserVO loginPro(UserVO user) {
		return memberMapper.loginPro(user);
	}
}
