package com.cg.springboot.dto;

import java.util.List;

import lombok.Data;

@Data
public class ClientResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<ClientBean> bean;
}
