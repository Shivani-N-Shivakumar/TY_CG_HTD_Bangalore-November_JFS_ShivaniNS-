package com.cg.springrestfsm.service;

import java.util.List;

import com.cg.springrestfsm.dto.OrderBean;

public interface OrderService {
	public boolean deleteOrder(int orderno);

	public List<OrderBean> getOrder();

	public boolean addOrder(OrderBean bean);

	public boolean modifyOrder(int orderno, OrderBean bean);

	public OrderBean searchOrder(int orderno);
}
