package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.dto.OrderBean;

public interface OrderService {
	public boolean deleteOrder(int orderno);

	public List<OrderBean> getOrder();

	public boolean addOrder(OrderBean bean);

	public boolean modifyOrder(int orderno, OrderBean bean);

	public OrderBean searchOrder(int orderno);
}
