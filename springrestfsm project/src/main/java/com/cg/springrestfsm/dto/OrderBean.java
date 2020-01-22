package com.cg.springrestfsm.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order")
public class OrderBean {
	@Id
	@Column
	private int orderno;
	@Column
	private int clientId;
	@Column
	private int haulierId;
	@Column
	private int productId;
	@Column
	private int quantity;
	@Column
	private String deliverydate;
}
