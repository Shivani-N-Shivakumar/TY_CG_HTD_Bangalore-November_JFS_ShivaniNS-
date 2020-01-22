package com.cg.springrestfsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.OrderDao;
import com.cg.springrestfsm.dto.OrderBean;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao dao;

	@Override
	public boolean deleteOrder(int orderno) {

		return dao.deleteOrder(orderno);
	}

	@Override
	public List<OrderBean> getOrder() {

		return dao.getOrder();
	}

	@Override
	public boolean addOrder(OrderBean bean) {

		return dao.addOrder(bean);
	}

	@Override
	public boolean modifyOrder(int orderno, OrderBean bean) {

		return dao.modifyOrder(orderno, bean);
	}

	@Override
	public OrderBean searchOrder(int orderno) {

		return dao.searchOrder(orderno);
	}

}
