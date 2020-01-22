package com.cg.springrestfsm.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springrestfsm.dto.LandBean;
import com.cg.springrestfsm.dto.LandResponse;
import com.cg.springrestfsm.service.LandService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class LandController {
	@Autowired
	LandService service;

	@PostMapping(path = "/add-land", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse addLand(@RequestBody LandBean bean) {
		LandResponse response = new LandResponse();
		if (service.addLand(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Land id already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-land/{landid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse searchLand(@PathVariable("landid") int landid) {
		LandResponse response = new LandResponse();
		LandBean bean = service.searchLand(landid);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land found");
			response.setLand(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Land id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-alllands", produces = MediaType.APPLICATION_JSON_VALUE)
	public LandResponse getLand() {
		LandResponse response = new LandResponse();
		List<LandBean> list = service.getLand();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Land found");
			response.setLand(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

}
