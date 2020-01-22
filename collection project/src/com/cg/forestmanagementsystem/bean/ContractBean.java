package com.cg.forestmanagementsystem.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContractBean implements Serializable {
	private int contractNO;
	private int custId;
	private int haulId;
	private int prodId;
	private int quantity;
	private String deliveryDate;
	private String deliveryDay;

}
