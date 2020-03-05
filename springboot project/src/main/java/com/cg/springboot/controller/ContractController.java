package com.cg.springboot.controller;

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

import com.cg.springboot.dto.ContractBean;
import com.cg.springboot.dto.ContractResponse;

import com.cg.springboot.service.ContractService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class ContractController {
	@Autowired
	ContractService service;

	@PostMapping(path = "/add-contract", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse addContract(@RequestBody ContractBean bean) {
		ContractResponse response = new ContractResponse();
		if (service.addContract(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("contract id already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-contract/{contractno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse searchContract(@PathVariable("contractno") int contractno) {
		ContractResponse response = new ContractResponse();
		ContractBean bean = service.searchContract(contractno);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract found");
			response.setContract(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contract id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allContracts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse getContract() {
		ContractResponse response = new ContractResponse();
		List<ContractBean> list = service.getContract();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract found");
			response.setContract(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-contract/{contractno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse deleteContract(@PathVariable("contractno") int contractno) {
		ContractResponse response = new ContractResponse();
		if (service.deleteContract(contractno)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Contract not found");
		}
		return response;
	}

	@PutMapping(path = "/modify-contract", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ContractResponse modifyContract(@RequestBody int contractno, ContractBean bean) {
		ContractResponse response = new ContractResponse();
		if (service.modifyContract(contractno, bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Contract modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("contract already exists");
		}
		return response;
	}
}