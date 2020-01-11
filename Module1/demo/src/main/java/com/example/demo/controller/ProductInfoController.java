package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductInfo;
import com.example.demo.dto.ProductInfoResponse;

import com.example.demo.service.ProductInfoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class ProductInfoController {
	@Autowired
	ProductInfoService service;
	private ProductInfoResponse response;

	@GetMapping(path = "/get-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse searchProducts(@RequestParam("productid") int productid) {
		ProductInfoResponse response = new ProductInfoResponse();
		List<ProductInfo> beans = service.getproducts(productid);
		if (beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Product found");
		} else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Product Not Found");
		}

		return response;
	}
}
