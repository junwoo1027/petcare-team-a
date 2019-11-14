package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.Member;
import com.petcare.web.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	public Member getMember(Member member) {
		return memberMapper.getMember(member);
	}

}
