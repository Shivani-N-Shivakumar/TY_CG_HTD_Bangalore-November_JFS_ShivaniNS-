package com.cg.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="land")
@Data
public class LandBean {
	@Id
	@Column
	private int landId;
	@Column
	private String landOwner;
	@Column
	private int landCost;
	@Column
	private int acres;
}
