package com.lazymong.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Member {
	
	@javax.persistence.Id
    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String memberId;
	private String memberPass;
	private String memberName;
	private String regDate;
	private String modDate;

	protected Member() {}
	public Member(String memberId, String memberPass, String memberName) {
		this.memberId = memberId;
		this.memberPass = memberPass;
		this.memberName = memberName;
	}
	
	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getModDate() {
		return modDate;
	}
	public void setModDate(String modDate) {
		this.modDate = modDate;
	}	
	
}
