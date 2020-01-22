package com.cg.jdbc.bean;

public class ClientBean {
	private int custId;
	private long telNo;
	private String cName;
	private String stad1;
	private String stad2;
	private String town;
	private String postCode;
	private String email;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public long getTelNo() {
		return telNo;
	}

	public void setTelNo(long telNo) {
		this.telNo = telNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getStad1() {
		return stad1;
	}

	public void setStad1(String stad1) {
		this.stad1 = stad1;
	}

	public String getStad2() {
		return stad2;
	}

	public void setStad2(String stad2) {
		this.stad2 = stad2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", telNo=" + telNo + ", cName=" + cName + ", stad1=" + stad1
				+ ", stad2=" + stad2 + ", town=" + town + ", postCode=" + postCode + ", email=" + email + "]";
	}

}
