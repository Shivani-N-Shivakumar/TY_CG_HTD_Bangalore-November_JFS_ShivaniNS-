package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product-info")
public class ProductInfo {
	@Id
	@Column(unique=true,nullable=false)
	private int productid;
	@Column(nullable=false)
	private int id;
	@Column(unique=true,nullable=false)
	private String name;
	@Column(nullable=false)
	private int quantity;
	@Column(nullable=false)
	private String details;
}
