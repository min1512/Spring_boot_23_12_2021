package com.example.demo.dto;

import java.util.Date;

public class MemberForm {
	private String idx;
	private String memberid;
	private String memberpw;
	private String membername;
	private String memberbirthday;
	private String memberphonetel;	
	private Date regdate;
	
	public  MemberForm(String idx, String memberid, String memberpw, String membername, String memberbirthday, String memberphonetel, Date regdate) {		
		this.idx = idx;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberbirthday = memberbirthday;
		this.memberphonetel = memberphonetel;		
		this.regdate = regdate;
	}	

	@Override
	public String toString() {
		return "MemberForm{" +				
				"id='" + idx + '\'' +
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
	
	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

}
