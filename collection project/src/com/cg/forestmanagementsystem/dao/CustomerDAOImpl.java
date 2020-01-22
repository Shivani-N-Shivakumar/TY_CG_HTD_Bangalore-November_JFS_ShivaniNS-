package com.cg.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestmanagementsystem.bean.ContractBean;
import com.cg.forestmanagementsystem.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO {
	private List<CustomerBean> customerbean = new ArrayList<CustomerBean>();

	@Override
	public boolean addCustomer(CustomerBean bean) {
		for (CustomerBean cb : customerbean) {

			if (cb.getCustId() == bean.getCustId()) {

				return false;
			}
		}
		customerbean.add(bean);
		return true;
	}

	@Override
	public boolean modifyCustomer(int custId) {
		for (CustomerBean cb : customerbean) {
			if (cb.getCustId() == custId) {
				return true;

			}
		}

		return false;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		
		for (CustomerBean cb : customerbean) {
			CustomerBean bean = null;
			if (cb.getCustId() == custId) {
				bean = cb;
			}

		
		if (bean != null) {
			customerbean.remove(bean);
			return true;
		}
		}
		return false;
	}

	@Override
	public List<CustomerBean> getAllCustomer(CustomerBean bean) {

		return customerbean;
	}

	@Override
	public CustomerBean getCustomer(int custId) {
		for (CustomerBean cb : customerbean) {
			if (cb.getCustId() == custId) {
				return cb;
			}
		}

		return null;
	}

}
