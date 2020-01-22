package com.cg.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="land")
public class LandBean {
	@Id
	@Column(unique=true,nullable=false)
	private int landId;
	@Column(nullable=false)
	private String landOwner;
	@Column(nullable=false)
	private int landCost;
	@Column(nullable=false)
	private int acres;
}
