package com.cg.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="contract")
@Entity
@Data
public class ContractBean {
	@Id
	@Column
	private int contractNO;
	@Column
	private int custId;
	@Column
	private int haulId;
	@Column
	private int prodId;
	@Column
	private int quantity;
	@Column
	private String deliveryDate;
	@Column
	private String deliveryDay;

}
