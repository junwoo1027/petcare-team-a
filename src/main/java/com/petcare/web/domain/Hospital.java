package com.petcare.web.domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import lombok.*;

@Data
public class Hospital {

	private String hospitalId;

	private String hospitalPw;
	
	private String hospitalPw2;
	
	private String hospitalName;
	
	private String hospitalAddress;
	
	private String hospitalPhone;
	
	private String hospitalEmail;
	
	private String hospitalOpen;
	
	private String hospitalClose;
	
	private String hospitalSpecies;
	
	private MultipartFile hospitalPhoto;
	
	private List<Character> characters;
	
	private String hospitalIntro;
	
	private Date hospitalJoindate;
	
}
