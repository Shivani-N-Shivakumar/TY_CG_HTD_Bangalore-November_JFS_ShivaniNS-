package com.example.demo.dto;

import java.util.List;

import lombok.Data;

@Data
public class ProductInfoResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<ProductInfo> product;
}
