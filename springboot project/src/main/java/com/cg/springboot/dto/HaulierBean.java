package com.cg.springboot.dto;

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
	@Column(unique=true,nullable=false)
	private int haulid;
	@Column(nullable=false)
	private int htelno;
	@Column(nullable=false)
	private String hname;
	@Column(nullable=false)
	private String hstad1;
	@Column(nullable=false)
	private String hstad2;
	@Column(nullable=false)
	private String htown;
	@Column(nullable=false)
	private String hpostcode;
	@Column(nullable=false)
	private String hemail;
}
