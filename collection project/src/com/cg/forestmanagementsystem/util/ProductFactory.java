package com.cg.forestmanagementsystem.util;

import com.cg.forestmanagementsystem.dao.AdminDao;
import com.cg.forestmanagementsystem.dao.AdminDaoImpl;
import com.cg.forestmanagementsystem.dao.ProductDAO;
import com.cg.forestmanagementsystem.dao.ProductDAOImpl;
import com.cg.forestmanagementsystem.services.AdminService;
import com.cg.forestmanagementsystem.services.AdminServiceImpl;
import com.cg.forestmanagementsystem.services.ProductService;
import com.cg.forestmanagementsystem.services.ProductServiceImpl;

public class ProductFactory {

	private ProductFactory() {

	}

	public static ProductDAO instanceOfProductDaoImpl() {
		ProductDAO dao = new ProductDAOImpl();
		return dao;
	}

	public static ProductService instanceOfProductserviceImpl() {
		ProductService services = new ProductServiceImpl();
		return services;
	}

}
