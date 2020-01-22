package com.cg.springrestfsm.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springrestfsm.dto.HaulierBean;
import com.cg.springrestfsm.dto.HaulierResponse;
import com.cg.springrestfsm.service.HaulierService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class HaulierController {
	@Autowired
	HaulierService service;

	@PostMapping(path = "/add-haulier", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse addHaulier(@RequestBody HaulierBean bean) {
		HaulierResponse response = new HaulierResponse();
		if (service.addHaulier(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier id already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-haulier/{haulierId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse searchHaulier(@PathVariable("haulierId") int haulierId) {
		HaulierResponse response = new HaulierResponse();
		HaulierBean bean = service.searchHaulier(haulierId);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier found");
			response.setHaulier(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allHauliers", produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse getHaulier() {
		HaulierResponse response = new HaulierResponse();
		List<HaulierBean> list = service.getHaulier();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier found");
			response.setHaulier(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-haulier/{haulierId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse deleteHaulier(@PathVariable("haulierId") int haulierId) {
		HaulierResponse response = new HaulierResponse();
		if (service.deleteHaulier(haulierId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier not found");
		}
		return response;
	}

	@PutMapping(path = "/modify-haulier", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public HaulierResponse modifyHaulier(@RequestBody int haulierId, HaulierBean bean) {
		HaulierResponse response = new HaulierResponse();
		if (service.modifyHaulier(haulierId, bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Haulier modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Haulier already exists");
		}
		return response;
	}
}
