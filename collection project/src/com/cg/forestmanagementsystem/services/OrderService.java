package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.OrderBean;

public interface OrderService {
	boolean addOrder(OrderBean bean);

	public boolean deleteOrder(int orderno);

	public List<OrderBean> getAllOrder(OrderBean bean);
}
