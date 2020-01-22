package com.cg.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.springboot.dto.AdminResponse;
import com.cg.springboot.exception.AdminException;

@RestControllerAdvice
public class AdminControllerAdvice {
	@ExceptionHandler(AdminException.class)
	public AdminResponse handleEmployeeException(AdminException e) {
		AdminResponse response = new AdminResponse();
		response.setStatusCode(501);
		response.setMessage("Exception");
		response.setDescription(e.getMessage());
		return response;
	}
}
