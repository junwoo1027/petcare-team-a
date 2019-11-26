package com.petcare.web.domain;

import java.sql.Blob;
import java.util.Date;

import lombok.Data;

@Data
public class HospitalVO {
	private String hospitalId;
	private String hospitalPw;
	private String hospitalName;
	private String hospitalAddress;
	private String hospitalPhone;
	private String hospitalEmail;
	private String hospitalOpen;
	private String hospitalClose;
	private int hospitalNightcare;
	private int hospitalEmergency;
	private int hospitalSpecial;
	private int hospitalHotel;
	private String hospitalSpecies;
	private Blob hospitalPhoto;
	private String hospitalIntro;
	private Date hospitalJoindate;

}
