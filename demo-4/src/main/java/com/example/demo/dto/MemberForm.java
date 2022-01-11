package com.example.demo.dto;


public class MemberForm {
	private String memberid;
	private String memberpw;
	private String membername;
	private String memberbirthday;
	private String memberphonetel;
	
	public  MemberForm(String memberid, String memberpw, String membername, String memberbirthday, String memberphonetel) {
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
		this.memberbirthday = memberbirthday;
		this.memberphonetel = memberphonetel;
	}
	
	@Override
	public String toString() {
		return "MemberForm{" +
				"id='" + memberid + '\'' +
				", pw='" + memberpw + '\'' +
				", name='" + membername + '\'' +
				", birthday='" + memberbirthday + '\'' +
				", phonetel='" + memberphonetel + '\'' +
				'}';
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
	
}
