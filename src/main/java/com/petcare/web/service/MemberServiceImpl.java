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

}
