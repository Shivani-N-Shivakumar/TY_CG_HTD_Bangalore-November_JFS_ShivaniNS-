package com.capgemini.flightmanagementsystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.flightmanagementsystem.dto.FlightResponse;
import com.capgemini.flightmanagementsystem.exception.FlightException;

@RestControllerAdvice
public class FlightControllerAdvice {
	@ExceptionHandler(FlightException.class)
	public FlightResponse handleFlightException(FlightException e) {
		FlightResponse response = new FlightResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
