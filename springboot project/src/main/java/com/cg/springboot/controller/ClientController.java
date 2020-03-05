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

import com.cg.springboot.dto.ClientBean;
import com.cg.springboot.dto.ClientResponse;
import com.cg.springboot.service.ClientService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class ClientController {

	@Autowired
	ClientService service;

	@PostMapping(path = "/add-client", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ClientResponse addClient(@RequestBody ClientBean bean) {
		ClientResponse response = new ClientResponse();
		if (service.addClient(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Client added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("client with same name already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-client/{custId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientResponse searchClient(@PathVariable("custId") int custId) {
		ClientResponse response = new ClientResponse();
		ClientBean bean = service.searchClient(custId);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Client found");
			response.setBean(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Client id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allClients", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientResponse getClient() {
		ClientResponse response = new ClientResponse();
		List<ClientBean> list = service.getClient();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Client found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-client/{custId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ClientResponse deleteClient(@PathVariable("custId") int custId) {
		ClientResponse response = new ClientResponse();
		if (service.deleteClient(custId)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Client deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Client not found");
		}
		return response;
	}

	@PutMapping(path = "/modify-client", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ClientResponse modifyClient(@RequestBody int custId, ClientBean bean) {
		ClientResponse response = new ClientResponse();
		if (service.modifyClient(custId, bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Client modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("client with same name already exists");
		}
		return response;
	}

}