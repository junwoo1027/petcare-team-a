package com.petcare.web.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

//동물vo
@Data
public class AnimalVo {

	private int ano; //동물번호
	@NotEmpty(message ="이름을 입력해주세요.")
	private String name; //동물이름
	private String gender; //동물성별
	@Min(value=1, message="숫자를 입력해주세요.")
	private int weight; //동물 몸무게
	@NotEmpty(message = "동물 종류를 입력해주세요.")
	private String type; //동물 종류
	@Min(value=1, message="숫자를 입력해주세요.")
	private int age; //동물 나이
	private Date regdate; //등록일
	private Date lastcare; //마지막 진료 날짜
	private String owner;//동물주인
	
}
