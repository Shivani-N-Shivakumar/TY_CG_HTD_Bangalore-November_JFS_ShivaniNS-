package com.cg.forestmanagementsystem.dao;

import java.util.List;

import com.cg.forestmanagementsystem.bean.OrderBean;



public interface OrderDao {
	boolean addOrder(OrderBean bean);

	public boolean deleteOrder(int orderno);

	public List<OrderBean> getAllOrder(OrderBean bean);
}
