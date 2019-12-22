package com.cg.flipkart.factory;

import com.cg.flipkart.dao.ProductDAO;
import com.cg.flipkart.dao.ProductDAOImpl;
import com.cg.flipkart.service.ProductService;
import com.cg.flipkart.service.ProductServiceImpl;

public class ProductFactory {

	private ProductFactory() {
		
	}
	
	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao=new ProductDAOImpl();
		return dao;
	}
	
	public static ProductService instanceOfProductServiceImpl() {
		ProductService service=new ProductServiceImpl();
		return service;
	}
}
