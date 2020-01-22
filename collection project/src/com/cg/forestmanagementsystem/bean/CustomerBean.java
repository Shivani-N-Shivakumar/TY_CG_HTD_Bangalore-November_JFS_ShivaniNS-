package com.cg.forestmanagementsystem.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBean implements Serializable {

	private int custId;
	private long telNo;
	private String cName;
	private String town;
	private int postCode;
	private String email;

}
