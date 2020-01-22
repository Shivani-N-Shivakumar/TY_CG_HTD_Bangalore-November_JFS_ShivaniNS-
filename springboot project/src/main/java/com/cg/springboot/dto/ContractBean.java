package com.cg.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "contract")
@Entity
@Data
public class ContractBean {
	@Id
	@Column(unique=true,nullable=false)
	private int contractNO;
	@Column(nullable=false)
	private int custId;
	@Column(nullable=false)
	private int haulId;
	@Column(nullable=false)
	private int prodId;
	@Column(nullable=false)
	private int quantity;
	@Column(nullable=false)
	private String deliveryDate;
	@Column(nullable=false)
	private String deliveryDay;
}
