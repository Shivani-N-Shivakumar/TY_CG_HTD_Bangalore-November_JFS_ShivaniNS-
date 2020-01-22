package com.cg.jdbc.factory;

import com.cg.jdbc.dao.ProductDao;
import com.cg.jdbc.dao.ProductDaoImpl;

import com.cg.jdbc.service.ProductService;
import com.cg.jdbc.service.ProductServiceImpl;

public class ProductFactory {
	private ProductFactory() {

	}

	public static ProductDao instanceOfProductDaoImpl() {
		ProductDao dao = new ProductDaoImpl();
		return dao;
	}

	public static ProductService instanceOfProductServiceImpl() {
		ProductService service = new ProductServiceImpl();
		return service;
	}
}
