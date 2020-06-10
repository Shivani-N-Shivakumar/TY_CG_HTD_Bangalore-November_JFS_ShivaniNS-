package com.capgemini.flightmanagementsystem.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.flightmanagementsystem.dto.UserResponse;
import com.capgemini.flightmanagementsystem.exception.UserException;

@RestControllerAdvice
public class UserControllerAdvice {


	@ExceptionHandler(UserException.class)
	public UserResponse handleUserException(UserException e) {
		UserResponse response = new UserResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}

}
