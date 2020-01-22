package com.cg.springrestfsm.dto;

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
	private int contractNo;
	@Column
	private int clientId;
	@Column
	private int haulierId;
	@Column
	private int productId;
	@Column
	private int quantity;
	@Column
	private String deliveryDate;
	@Column
	private String deliveryDay;

}
