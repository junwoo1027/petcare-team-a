package com.petcare.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petcare.web.domain.MemberVO;
import com.petcare.web.mapper.LoginMapper;

@Service
public class LoginService {
	
	 	@Autowired
	    private LoginMapper loginMapper;

	    public MemberVO getCorrectMember(MemberVO member) {
	        return loginMapper.findCorrectUser(member);
	    }

}
