package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.UserInfo;
import com.example.demo.dto.UserInfoResponse;
import com.example.demo.service.UserInfoService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*", allowCredentials="true" )
public class UserInfoController {
	@Autowired
	UserInfoService service;
	private UserInfoResponse response;
	
	@PostMapping(path="/add-user",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse profile(@RequestBody UserInfo user) {
		UserInfoResponse response=new UserInfoResponse();
		if(service.Profile(user)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Profile Created Successful...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("User emailId already Exists!!!");
		}
		return response;
	}
	@GetMapping(path="/user-login",produces = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse login(@RequestParam("email") String email, @RequestParam("password") String password) {
		UserInfoResponse response=new UserInfoResponse();
		UserInfo user=service.login(email,password);

			if(user.getEmail().equalsIgnoreCase(email)&&user.getPassword().equalsIgnoreCase(password)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login Successful...");
			response.setUser(Arrays.asList(user));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Incorrect credentials!!!");
		}
		return response;
	}
	@PutMapping(path="/change-password" , produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	 public UserInfoResponse updatePassword(@RequestBody UserInfo user) {
			UserInfoResponse response = new UserInfoResponse();
			if(service.updatePassword(user.getId(),user.getPassword())) {
					response.setStatusCode(201);
					response.setMessage("success");
					response.setDescription("password Updated");
				}else {
					response.setStatusCode(401);
					response.setMessage("failure");
					response.setDescription("password not Updated");
				}
				
			
		return response;
	 }

}
