package com.example.demo.dto;

import java.sql.Timestamp;

public class MemberForm {
	private String idx;
	private String memberid;
	private String memberpw;
	private String membername;
	private String memberbirthday;
	private String memberphonetel;
	private Boolean loginUser;
	private Timestamp regdate;
	
	public  MemberForm(String idx, String memberid, String memberpw, String membername, String memberbirthday, String memberphonetel, Boolean loginUser, Timestamp regdate) {
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberbirthday = memberbirthday;
		this.memberphonetel = memberphonetel;
		this.loginUser = loginUser;
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "MemberForm{" +
				"idx='" + idx + '\'' +
				"id='" + memberid + '\'' +
				", pw='" + memberpw + '\'' +
				", name='" + membername + '\'' +
				", birthday='" + memberbirthday + '\'' +
				", phonetel='" + memberphonetel + '\'' +
				", regdate='" + regdate + '\'' +
				'}';
	}

	public String getIdx() {
		return idx;
	}

	public void setIdx(String idx) {
		this.idx = idx;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMemberpw() {
		return memberpw;
	}

	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getMemberbirthday() {
		return memberbirthday;
	}

	public void setMemberbirthday(String memberbirthday) {
		this.memberbirthday = memberbirthday;
	}

	public String getMemberphonetel() {
		return memberphonetel;
	}

	public void setMemberphonetel(String memberphonetel) {
		this.memberphonetel = memberphonetel;
	}
	
	public Boolean getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(Boolean loginUser) {
		this.loginUser = loginUser;
	}
	
	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
}
