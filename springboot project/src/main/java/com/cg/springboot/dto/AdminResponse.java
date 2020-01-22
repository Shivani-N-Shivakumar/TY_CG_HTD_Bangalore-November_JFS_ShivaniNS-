package com.cg.springboot.dto;

import java.util.List;

import lombok.Data;

@Data
public class AdminResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<AdminBean> bean;
}
