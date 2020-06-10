package com.capgemini.flightmanagementsystem.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.flightmanagementsystem.dto.User;
import com.capgemini.flightmanagementsystem.dto.UserResponse;
import com.capgemini.flightmanagementsystem.service.UserService;

@CrossOrigin(origins = "*", allowedHeaders ="*" ,allowCredentials = "true")
@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping(path ="/auth", produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse auth(@RequestBody User bean) {
		User userBean = service.login(bean.getEmail(), bean.getPassword());
		UserResponse response = new UserResponse();
		if(userBean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login successful");
			response.setUser(Arrays.asList(userBean));
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("invalid credentials");
		}
		return response;
		}
	
	
}
