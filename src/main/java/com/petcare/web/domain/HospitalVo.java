package com.petcare.web.domain;

public class HospitalVo {

	private String hospitalid;
	private String name;
	
	public String getHospitalid() {
		return hospitalid;
	}
	public void setHospitalid(String hospitalid) {
		this.hospitalid = hospitalid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HospitalVo [hospitalid=" + hospitalid + ", name=" + name + "]";
	}
	
}
