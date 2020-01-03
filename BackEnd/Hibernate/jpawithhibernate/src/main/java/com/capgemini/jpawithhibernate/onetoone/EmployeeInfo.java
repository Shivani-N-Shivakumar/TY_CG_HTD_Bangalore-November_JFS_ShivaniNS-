package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.manytoone.EmployeeExperience;

@Entity
@Table(name="employee_info")
public class EmployeeInfo {
@Id
@Column
	private int eid;
@Column
	private String ename;
@Column
	private String email;
@Column
	private String password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String name) {
		this.ename = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@OneToOne(cascade=CascadeType.ALL,mappedBy="emp")
	private EmployeeOther other;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="emp")
	private EmployeeExperience exp;
@ManyToMany(cascade=CascadeType.ALL,mappedBy="List")
private<List<>>
	
	
}
