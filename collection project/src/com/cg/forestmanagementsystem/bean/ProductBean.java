package com.cg.forestmanagementsystem.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductBean implements Serializable {
	private int proId;
	private String pname;
	private String pdesc;
}
