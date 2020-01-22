package com.cg.springrestfsm.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@Column
	private int productId;
	@Column
	private String productName;
	@Column
	private String productDescription;
	
}
