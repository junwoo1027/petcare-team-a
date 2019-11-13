package com.petcare.web.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {

	private int userNo;
	private String id;
	private String pwd;
	private String address;
	private String phoneNum;
	private String email;
	private String name;
	private Date dateTime;
	private Date lastLogin;
}
