package com.petcare.web.domain;

import lombok.Data;

@Data
public class PetVO {

	//예약할떄 동물 불렁는 것 때문에만든 것, 
	
	private String petNo;
	private String petName;
	private String petGender;
	private String petNeuter;
	private String petWeight;
	private String petSpecies;
	private String petBreed;
	private String petAge;
	private String petPhoto;
	private String userId;
	private String regDate;
	
	
}
