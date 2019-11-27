package com.petcare.web.domain;

import java.util.Date;

import lombok.Data;

@Data
public class TreatmentVO {
	private int treatNo;
	private int petNo;
	private String hospitalId;
	private String treatContent;
	private Date treatRegdate;
	
}
