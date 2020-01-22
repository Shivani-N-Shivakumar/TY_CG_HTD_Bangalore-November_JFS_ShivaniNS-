package com.cg.forestmanagementsystem.util;


import com.cg.forestmanagementsystem.dao.CustomerDAO;
import com.cg.forestmanagementsystem.dao.CustomerDAOImpl;

import com.cg.forestmanagementsystem.services.CustomerService;
import com.cg.forestmanagementsystem.services.CustomerServiceImpl;

public class CustomerFactory {

	private CustomerFactory() {

	}

	public static CustomerDAO instanceOfCustomerDaoImpl() {
		CustomerDAO dao = new CustomerDAOImpl();
		return dao;
	}

	public static CustomerService instanceOfCustomerserviceImpl() {
		CustomerService services = new CustomerServiceImpl();
		return services;
	}
}
