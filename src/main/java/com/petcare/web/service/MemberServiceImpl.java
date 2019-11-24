package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.MemberVO;
import com.petcare.web.mapper.MemberMapper;


@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	//회원가입
	@Override
	public void register(MemberVO memberVO) {
		memberMapper.register(memberVO);
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
}
