package com.capgemini.flightmanagementsystem.controller;

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

import com.capgemini.flightmanagementsystem.dto.Flight;
import com.capgemini.flightmanagementsystem.dto.FlightResponse;
import com.capgemini.flightmanagementsystem.service.FlightService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class FlightController {

	@Autowired
	FlightService service;

	@PostMapping(path = "/add-flight", produces = MediaType.APPLICATION_JSON_VALUE, consumes =MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse addDoctor(@RequestBody Flight bean) {
		FlightResponse response = new FlightResponse();
		if (service.addFlight(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Flight with this Number already exists");
		}
		return response;
	}
	
	@DeleteMapping(path = "/delete-flight/{flightNo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse deleteFlight(@PathVariable("flightNo") int flightNo) {
		FlightResponse response = new FlightResponse();
		if (service.deleteFlight(flightNo)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Flight not found");
		}
		return response;
	}
	
	
	
	@GetMapping(path = "/get-allflights", produces = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse getAllFlights() {
		FlightResponse response = new FlightResponse();
		List<Flight> list = service.getAllFlights();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight Found");
			response.setBean(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@PutMapping(path = "/modify-flight", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse modifyFlight(@RequestBody Flight bean) {
		FlightResponse response = new FlightResponse();
		if (service.modifyFlight( bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight Details modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Unable to modify the Flight Details");
		}
		return response;
	}
	@GetMapping(path="/view-flight/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse viewFlight(@PathVariable("id") int id) {
		FlightResponse response = new FlightResponse();
		Flight flight=service.searchFlight(id);
		if(flight != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Flight Found");
			response.setBean(Arrays.asList(flight));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Flight Number does not exist");
		}
		return response;
	}

}
