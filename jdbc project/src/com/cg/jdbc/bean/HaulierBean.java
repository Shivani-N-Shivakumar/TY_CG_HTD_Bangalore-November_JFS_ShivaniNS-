package com.cg.jdbc.bean;

public class HaulierBean {
	private int haulid;
	private long htelno;
	private String hname;
	private String hstad1;
	private String hstad2;
	private String htown;
	private String hpostcode;
	private String hemail;

	public int getHaulid() {
		return haulid;
	}

	public void setHaulid(int haulid) {
		this.haulid = haulid;
	}

	public long getHtelno() {
		return htelno;
	}

	public void setHtelno(long htelno) {
		this.htelno = htelno;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHstad1() {
		return hstad1;
	}

	public void setHstad1(String hstad1) {
		this.hstad1 = hstad1;
	}

	public String getHstad2() {
		return hstad2;
	}

	public void setHstad2(String hstad2) {
		this.hstad2 = hstad2;
	}

	public String getHtown() {
		return htown;
	}

	public void setHtown(String htown) {
		this.htown = htown;
	}

	public String getHpostcode() {
		return hpostcode;
	}

	public void setHpostcode(String hpostcode) {
		this.hpostcode = hpostcode;
	}

	public String getHemail() {
		return hemail;
	}

	public void setHemail(String hemail) {
		this.hemail = hemail;
	}

	@Override
	public String toString() {
		return "HaulierBean [haulid=" + haulid + ", htelno=" + htelno + ", hname=" + hname + ", hstad1=" + hstad1
				+ ", hstad2=" + hstad2 + ", htown=" + htown + ", hpostcode=" + hpostcode + ", hemail=" + hemail + "]";
	}

}
