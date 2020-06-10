package com.capgemini.flightmanagementsystem.dto;

import java.util.List;

import lombok.Data;

@Data
public class FlightResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<Flight> bean;
}
