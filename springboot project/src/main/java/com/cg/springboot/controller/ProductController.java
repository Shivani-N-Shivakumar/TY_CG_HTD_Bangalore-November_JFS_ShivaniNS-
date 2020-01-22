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

import com.cg.springboot.dto.ProductBean;
import com.cg.springboot.dto.ProductResponse;
import com.cg.springboot.service.ProductService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class ProductController {
	@Autowired
	ProductService service;

	@PostMapping(path = "/add-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if (service.addProduct(bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("product added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product id already exists");
		}
		return response;
	}

	@GetMapping(path = "/search-product", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchProduct(@RequestParam("prodid") int prodid) {
		ProductResponse response = new ProductResponse();
		ProductBean bean = service.searchProduct(prodid);
		if (bean != null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(Arrays.asList(bean));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id does not exist");
		}
		return response;
	}

	@GetMapping(path = "/view-allProducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse getProduct() {
		ProductResponse response = new ProductResponse();
		List<ProductBean> list = service.getProduct();
		if (list.size() != 0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product found");
			response.setProduct(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;

	}

	@DeleteMapping(path = "/delete-product/{prodid}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse deleteProduct(@PathVariable("prodid") int prodid) {
		ProductResponse response = new ProductResponse();
		if (service.deleteProduct(prodid)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product deleted");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product not found");
		}
		return response;
	}

	@PutMapping(path = "/modify-product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse modifyProduct(@RequestBody int prodid, ProductBean bean) {
		ProductResponse response = new ProductResponse();
		if (service.modifyProduct(prodid, bean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product modified");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("product already exists");
		}
		return response;
	}
}
