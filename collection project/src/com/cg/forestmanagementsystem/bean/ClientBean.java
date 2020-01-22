package com.cg.forestmanagementsystem.bean;

public class ClientBean {
	private int cliId;
	private long telNo;
	private String cliName;
	private String town;
	private String postCode;
	private String email;

	public int getCliId() {
		return cliId;
	}

	public void setCliId(int cliId) {
		this.cliId = cliId;
	}

	public long getTelNo() {
		return telNo;
	}

	public void setTelNo(long telNo) {
		this.telNo = telNo;
	}

	public String getCliName() {
		return cliName;
	}

	public void setCliName(String cliName) {
		this.cliName = cliName;
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
		return "ClientBean [cliId=" + cliId + ", telNo=" + telNo + ", cliName=" + cliName + ", town=" + town
				+ ", postCode=" + postCode + ", email=" + email + "]";
	}

}
