package com.cg.hibernate.dto;

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
	@Column
	private int custId;
	@Column
	private long telNo;
	@Column
	private String cName;
	@Column
	private String stad1;
	@Column
	private String stad2;
	@Column
	private String town;
	@Column
	private String postCode;
	@Column
	private String email;
}
