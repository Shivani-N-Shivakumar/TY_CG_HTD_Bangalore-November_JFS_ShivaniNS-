package com.cg.hibernate.dto;

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
	private int haulid;
	@Column
	private long htelno;
	@Column
	private String hname;
	@Column
	private String hstad1;
	@Column
	private String hstad2;
	@Column
	private String htown;
	@Column
	private String hpostcode;
	@Column
	private String hemail;
}
