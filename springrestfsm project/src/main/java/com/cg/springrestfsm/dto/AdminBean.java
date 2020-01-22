package com.cg.springrestfsm.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="admin")
public class AdminBean {
	@Id
	@Column
	private int adminId;
	@Column
	private String adminName;
	@Column
	private String adminPassword;
	@Column
	private String role;
}
