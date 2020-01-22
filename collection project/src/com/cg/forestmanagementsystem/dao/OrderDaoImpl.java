package com.cg.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestmanagementsystem.bean.ClientBean;
import com.cg.forestmanagementsystem.bean.OrderBean;

public class OrderDaoImpl implements OrderDao {
	private List<OrderBean> orderbean = new ArrayList<OrderBean>();

	@Override
	public boolean addOrder(OrderBean bean) {
		for (OrderBean cb : orderbean) {

			if (cb.getOrderno() == bean.getOrderno()) {

				return false;
			}
		}
		orderbean.add(bean);
		return true;
	}

	@Override
	public boolean deleteOrder(int orderno) {
		for (OrderBean cb : orderbean) {
			OrderBean bean = null;
			if (cb.getOrderno() == orderno) {
				bean = cb;
			}

			if (bean != null) {
				orderbean.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<OrderBean> getAllOrder(OrderBean bean) {

		return orderbean;
	}

}
