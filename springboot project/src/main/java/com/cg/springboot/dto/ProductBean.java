package com.cg.springboot.dto;

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
	@Column(unique=true,nullable=false)
	private int prodid;
	@Column(nullable=false)
	private String pname;
	@Column(nullable=false)
	private String pdesc;
}
