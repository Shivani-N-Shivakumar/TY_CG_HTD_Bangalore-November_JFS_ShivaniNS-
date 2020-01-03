package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

@Entity
@Table(name="employee_experience")
public class EmployeeExperience {
	@Id
	@Column
	private int expid;
	@Column
	private String cname;
	@Column
	private int  year;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeInfo emp;

	public int getExpid() {
		return expid;
	}

	public void setExpid(int expid) {
		this.expid = expid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public EmployeeInfo getEmp() {
		return emp;
	}

	public void setEmp(EmployeeInfo emp) {
		this.emp = emp;
	}
	
	
}
