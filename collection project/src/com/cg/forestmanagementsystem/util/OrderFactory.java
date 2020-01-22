package com.cg.forestmanagementsystem.util;


import com.cg.forestmanagementsystem.dao.OrderDao;
import com.cg.forestmanagementsystem.dao.OrderDaoImpl;

import com.cg.forestmanagementsystem.services.OrderService;
import com.cg.forestmanagementsystem.services.OrderServiceImpl;

public class OrderFactory {
	private OrderFactory() {

	}

	public static OrderDao instanceOfOrderDaoImpl() {
		OrderDao dao = new OrderDaoImpl();
		return dao;
	}

	public static OrderService instanceOfOrderserviceImpl() {
		OrderService services = new OrderServiceImpl();
		return services;
	}
}
