package com.cg.springrestfsm.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="haulier")
@Entity
@Data
public class HaulierBean {
	@Id
	@Column
	private int haulierId;
	@Column
	private int telephoneNumber;
	@Column
	private String haulierName;
	@Column
	private String streetAddress1;
	@Column
	private String streetAddress2;
	@Column
	private String town;
	@Column
	private String postcode;
	@Column
	private String email;
}
