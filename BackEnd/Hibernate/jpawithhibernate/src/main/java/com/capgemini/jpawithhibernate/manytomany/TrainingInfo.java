package com.capgemini.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

@Entity
@Table(name="training_info")
public class TrainingInfo {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	@Column
	private String duration;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="training_employee",
	joinColumns=@JoinColumn(name="tid"),
	inverseJoinColumns=@JoinColumn(name="eid"))
	private List<EmployeeInfo> eList;
	

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<EmployeeInfo> geteList() {
		return eList;
	}

	public void seteList(List<EmployeeInfo> eList) {
		this.eList = eList;
	}

}
