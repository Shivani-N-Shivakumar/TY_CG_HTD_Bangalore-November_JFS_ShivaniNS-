package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dto.OrderBean;

public interface OrderService {
	boolean addOrder(OrderBean bean);

	public boolean deleteOrder(int orderno);

	public List<OrderBean> getAllOrder(OrderBean bean);

}
