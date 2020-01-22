package com.cg.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "scheduler")
public class SchedulerBean {
	@Id
	@Column
	private int scheduleId;
	@Column
	private int contractId;
	@Column
	private int productId;
	@Column
	private int quantity;
	@Column
	private String delivaryDate;
}
