package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.OrderBean;
import com.cg.forestmanagementsystem.dao.OrderDao;
import com.cg.forestmanagementsystem.util.OrderFactory;

public class OrderServiceImpl implements OrderService{
	OrderDao dao = OrderFactory.instanceOfOrderDaoImpl();

	@Override
	public boolean addOrder(OrderBean bean) {
		
		return dao.addOrder(bean);
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
