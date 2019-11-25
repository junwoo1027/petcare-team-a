package com.petcare.web.domain;

import java.util.Date;

import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import lombok.*;

@Data
public class Hospital {
	
	@NotEmpty(message = "ID를 입력하세요.")
	@Size(min = 5, max = 10, message = "ID는 5 ~ 10글자이어야 합니다.")
	private String hospitalId;
	
	@NotEmpty(message = "비밀번호를 입력하세요.")
	@Size(min = 8, max = 16, message = "비밀번호는 8 ~ 16글자이어야 합니다.")
	private String hospitalPw;
	
	@NotEmpty(message = "비밀번호를 입력하세요.")
	@Size(min = 8, max = 16, message = "비밀번호는 8 ~ 16글자이어야 합니다.")
	private String hospitalPw2;
	
	@NotEmpty(message = "이름을 입력하세요.")
	private String hospitalName;
	
	@NotEmpty(message = "주소를 입력하세요.")
	private String hospitalAddress;
	
	@NotEmpty(message = "전화번호를 입력하세요.")
	@Pattern(regexp = "(^[0-9]{10,11})", message = " '-' 를 제외한 숫자만 적어주세요.")
	private String hospitalPhone;
	
	@NotEmpty(message = "이메일을 입력하세요.")
	@Email(message = "이메일 형식이 아닙니다.")
	private String hospitalEmail;
	
	private String hospitalOpen;
	
	private String hospitalClose;
	
	private String hospitalType;
	
	private MultipartFile hospitalPhoto;
	
	private String hospitalIntro;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private Date userJoindate;
	
}
