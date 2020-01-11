package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "order-info")
public class OrderInfo {
	@Id
	@Column(unique=true,nullable=false)
	private int orderid;
	@Column(nullable=false)
	private int productid;
	@Column(nullable=false)
	private int id;
	
}
