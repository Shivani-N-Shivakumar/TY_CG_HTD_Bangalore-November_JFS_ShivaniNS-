package com.cg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboot.dto.AdminBean;
import com.cg.springboot.dto.AdminResponse;
import com.cg.springboot.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse register(@RequestBody AdminBean bean) {

		AdminResponse response = new AdminResponse();
		if (service.register(bean)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Admin registered");

		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Admin already exists");
		}
		return response;
	}

	@PutMapping(path = "/change-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public AdminResponse changePassword(@RequestBody AdminBean bean) {
		AdminResponse response = new AdminResponse();
		if (service.changePassword(bean.getAdminId(), bean.getAdminPassword())) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("password changed");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("password not changed");
		}

		return response;
	}

}
