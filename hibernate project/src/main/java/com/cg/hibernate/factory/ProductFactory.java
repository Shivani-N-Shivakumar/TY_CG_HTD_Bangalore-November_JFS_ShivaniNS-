package com.cg.hibernate.factory;

import com.cg.hibernate.dao.ProductDao;
import com.cg.hibernate.dao.ProductDaoImpl;
import com.cg.hibernate.service.ProductService;
import com.cg.hibernate.service.ProductServiceImpl;

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
