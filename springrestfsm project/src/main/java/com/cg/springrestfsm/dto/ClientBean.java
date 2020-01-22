package com.cg.springrestfsm.dto;

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
	private int clientId;
	@Column
	private long telephoneNumber;
	@Column
	private String clientName;
	@Column
	private String streetAddress1;
	@Column
	private String streetAddress2;
	@Column
	private String town;
	@Column
	private String postCode;
	@Column
	private String email;
}
