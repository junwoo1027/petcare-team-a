package com.petcare.web.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

//동물vo
@Data
public class PetVO {

	private int petNo; //동물번호
	@NotEmpty(message ="이름을 입력해주세요.")
	private String petName; //동물이름
	private String petGender; //동물성별
	private String petNeuter; //중성화
	@Min(value=1, message="숫자를 입력해주세요.")
	private int petWeight; //동물 몸무게
	@NotEmpty(message = "동물 종류를 입력해주세요.")
	private String petSpecies; //동물 종류
	@NotEmpty(message = "동물 품종을 입력해주세요.")
	private String petBreed; //품종
	@Min(value=1, message="숫자를 입력해주세요.")
	private int petAge; //동물 나이
	private MultipartFile petPhoto; //동물사진
	private Date petRegdate; //등록일
	private String userId;//동물주인
	
}
