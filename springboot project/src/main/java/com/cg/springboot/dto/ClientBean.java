package com.cg.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Table(name = "client")
@Entity
@Data
public class ClientBean {
	@Id
	@Column(unique=true,nullable=false)
	private int custId;
	@Column(nullable=false)
	private long telNo;
	@Column(nullable=false)
	private String cName;
	@Column(nullable=false)
	private String stad1;
	@Column(nullable=false)
	private String stad2;
	@Column(nullable=false)
	private String town;
	@Column(nullable=false)
	private String postCode;
	@Column(nullable=false)
	private String email;
}
