package com.petcare.web.domain;

import java.sql.Blob;
import java.util.Date;

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
	public String getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalPw() {
		return hospitalPw;
	}
	public void setHospitalPw(String hospitalPw) {
		this.hospitalPw = hospitalPw;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public String getHospitalPhone() {
		return hospitalPhone;
	}
	public void setHospitalPhone(String hospitalPhone) {
		this.hospitalPhone = hospitalPhone;
	}
	public String getHospitalEmail() {
		return hospitalEmail;
	}
	public void setHospitalEmail(String hospitalEmail) {
		this.hospitalEmail = hospitalEmail;
	}
	public String getHospitalOpen() {
		return hospitalOpen;
	}
	public void setHospitalOpen(String hospitalOpen) {
		this.hospitalOpen = hospitalOpen;
	}
	public String getHospitalClose() {
		return hospitalClose;
	}
	public void setHospitalClose(String hospitalClose) {
		this.hospitalClose = hospitalClose;
	}
	public int getHospitalNightcare() {
		return hospitalNightcare;
	}
	public void setHospitalNightcare(int hospitalNightcare) {
		this.hospitalNightcare = hospitalNightcare;
	}
	public int getHospitalEmergency() {
		return hospitalEmergency;
	}
	public void setHospitalEmergency(int hospitalEmergency) {
		this.hospitalEmergency = hospitalEmergency;
	}
	public int getHospitalSpecial() {
		return hospitalSpecial;
	}
	public void setHospitalSpecial(int hospitalSpecial) {
		this.hospitalSpecial = hospitalSpecial;
	}
	public int getHospitalHotel() {
		return hospitalHotel;
	}
	public void setHospitalHotel(int hospitalHotel) {
		this.hospitalHotel = hospitalHotel;
	}
	public String getHospitalSpecies() {
		return hospitalSpecies;
	}
	public void setHospitalSpecies(String hospitalSpecies) {
		this.hospitalSpecies = hospitalSpecies;
	}
	public Blob getHospitalPhoto() {
		return hospitalPhoto;
	}
	public void setHospitalPhoto(Blob hospitalPhoto) {
		this.hospitalPhoto = hospitalPhoto;
	}
	public String getHospitalIntro() {
		return hospitalIntro;
	}
	public void setHospitalIntro(String hospitalIntro) {
		this.hospitalIntro = hospitalIntro;
	}
	public Date getHospitalJoindate() {
		return hospitalJoindate;
	}
	public void setHospitalJoindate(Date hospitalJoindate) {
		this.hospitalJoindate = hospitalJoindate;
	}
	@Override
	public String toString() {
		return "HospitalVO [hospitalId=" + hospitalId + ", hospitalPw=" + hospitalPw + ", hospitalName=" + hospitalName
				+ ", hospitalAddress=" + hospitalAddress + ", hospitalPhone=" + hospitalPhone + ", hospitalEmail="
				+ hospitalEmail + ", hospitalOpen=" + hospitalOpen + ", hospitalClose=" + hospitalClose
				+ ", hospitalNightcare=" + hospitalNightcare + ", hospitalEmergency=" + hospitalEmergency
				+ ", hospitalSpecial=" + hospitalSpecial + ", hospitalHotel=" + hospitalHotel + ", hospitalSpecies="
				+ hospitalSpecies + ", hospitalPhoto=" + hospitalPhoto + ", hospitalIntro=" + hospitalIntro
				+ ", hospitalJoindate=" + hospitalJoindate + "]";
	}
	
	

}
