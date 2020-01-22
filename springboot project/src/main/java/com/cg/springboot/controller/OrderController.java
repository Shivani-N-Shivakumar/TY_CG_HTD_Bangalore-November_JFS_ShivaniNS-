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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboot.dto.OrderBean;
import com.cg.springboot.dto.OrderResponse;
import com.cg.springboot.service.OrderService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class OrderController {
	@Autowired
	OrderService service;

	@PostMapping(path = "/add-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse addOrder(@RequestBody OrderBean bean) {
		OrderResponse response = new OrderResponse();
		if (service.addOrder(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order id already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-order", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse searchOrder(@RequestParam("orderno") int orderno) {
		OrderResponse response = new OrderResponse();
		OrderBean bean = service.searchOrder(orderno);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setOrder(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allOrders", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getOrder() {
		OrderResponse response = new OrderResponse();
		List<OrderBean> list = service.getOrder();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setOrder(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-order/{orderno}", produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse deleteOrder(@PathVariable("orderno") int orderno) {
		OrderResponse response = new OrderResponse();
		if (service.deleteOrder(orderno)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order not found");
		}
		return response;
	}

	@PutMapping(path = "/modify-order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse modifyOrder(@RequestBody int orderno, OrderBean bean) {
		OrderResponse response = new OrderResponse();
		if (service.modifyOrder(orderno, bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order  already exists");
		}
		return response;
	}
}
