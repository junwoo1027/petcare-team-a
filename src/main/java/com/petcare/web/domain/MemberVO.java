package com.petcare.web.domain;

import java.util.Date;

public class MemberVO {
	private String userId;
	private String userPw;
	private String userName;
	private String userAddress;
	private String userPhone;
	private String userEmail;
	private Date userJoinDate;
	private Date userLastlogin;
	private int userAuthority;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserJoinDate() {
		return userJoinDate;
	}
	public void setUserJoinDate(Date userJoinDate) {
		this.userJoinDate = userJoinDate;
	}
	public Date getUserLastlogin() {
		return userLastlogin;
	}
	public void setUserLastlogin(Date userLastlogin) {
		this.userLastlogin = userLastlogin;
	}
	public int getUserAuthority() {
		return userAuthority;
	}
	public void setUserAuthority(int userAuthority) {
		this.userAuthority = userAuthority;
	}
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAddress="
				+ userAddress + ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", userJoinDate="
				+ userJoinDate + ", userLastlogin=" + userLastlogin + ", userAuthority=" + userAuthority + "]";
	}

	
}
