package com.cg.hibernate.factory;

import com.cg.hibernate.dao.OrderDao;
import com.cg.hibernate.dao.OrderDaoImpl;
import com.cg.hibernate.service.OrderService;
import com.cg.hibernate.service.OrderServiceImpl;

public class OrderFactory {
	private OrderFactory() {

	}

	public static OrderService instanceOfOrderServiceImpl() {
		OrderService service = new OrderServiceImpl();
		return service;
	}

	public static OrderDao instanceOfOrderDaoImpl() {
		OrderDao dao = new OrderDaoImpl();
		return dao;
	}
}
