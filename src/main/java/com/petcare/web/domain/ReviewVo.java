package com.petcare.web.domain;

import java.util.Date;

public class ReviewVo {

	private int reviewNo;
	private String userid;
	private String content;
	private int rating;
	private Date regdate;
	private String hospitalid;
	
	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getId() {
		return userid;
	}

	public void setId(String userid) {
		this.userid = userid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public String getHospitalid() {
		return hospitalid;
	}
	
	public void setHospitalid(String hospitalid) {
		this.hospitalid = hospitalid;
	}

	@Override
	public String toString() {
		return "ReviewVo [id=" + userid + ", content=" + content + ", rating=" + rating + ", regdate=" + regdate
				+ ", hospitalid=" + hospitalid + "]";
	}
	
}
