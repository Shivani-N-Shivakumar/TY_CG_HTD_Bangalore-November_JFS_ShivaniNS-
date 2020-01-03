package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_other_info")
public class EmployeeOther {
@Id
@Column
private int id;
@Column
private String pancard;
@Column
private String fname;
@Column
private String mname;

@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="eid")
private EmployeeInfo empInfo;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPancard() {
	return pancard;
}

public void setPancard(String pancard) {
	this.pancard = pancard;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public EmployeeInfo getEmpInfo() {
	return empInfo;
}

public void setEmpInfo(EmployeeInfo empInfo) {
	this.empInfo = empInfo;
}


	
}
