package com.cg.hibernate.dao;

import java.util.List;

import com.cg.hibernate.dto.OrderBean;


public interface OrderDao {
	boolean addOrder(OrderBean bean);

	public boolean deleteOrder(int orderno);

	public List<OrderBean> getAllOrder(OrderBean bean);

}
