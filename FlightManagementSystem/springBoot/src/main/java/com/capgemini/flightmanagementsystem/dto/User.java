  package com.capgemini.flightmanagementsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "userInfo")
public class User {
	@Id
	@Column
	@GeneratedValue
	private int userId;
	
	@Column
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private String password;
	
	@Column
	private String accountType;
	
	
	

}