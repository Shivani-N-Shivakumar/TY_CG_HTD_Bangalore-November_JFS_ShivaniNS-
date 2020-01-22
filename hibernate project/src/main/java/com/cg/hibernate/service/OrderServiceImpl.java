package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dao.OrderDao;
import com.cg.hibernate.dto.OrderBean;
import com.cg.hibernate.factory.OrderFactory;

public class OrderServiceImpl implements OrderService{
	OrderDao dao = OrderFactory.instanceOfOrderDaoImpl();

	@Override
	public boolean addOrder(OrderBean bean) {
		
		return dao.addOrder(bean) ;
	}

	@Override
	public boolean deleteOrder(int orderno) {
		
		return dao.deleteOrder(orderno);
	}

	@Override
	public List<OrderBean> getAllOrder(OrderBean bean) {
		
		return dao.getAllOrder(bean);
	}

}
