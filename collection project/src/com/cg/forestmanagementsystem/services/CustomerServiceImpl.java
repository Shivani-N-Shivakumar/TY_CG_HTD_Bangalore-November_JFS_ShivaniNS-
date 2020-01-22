package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.CustomerBean;
import com.cg.forestmanagementsystem.dao.CustomerDAO;
import com.cg.forestmanagementsystem.util.CustomerFactory;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAO dao = CustomerFactory.instanceOfCustomerDaoImpl();

	@Override
	public List<CustomerBean> getAllCustomer(CustomerBean bean) {
		
		return dao.getAllCustomer(bean);
	}

	@Override
	public boolean addCustomer(CustomerBean bean) {
		
		return dao.addCustomer(bean);
	}

	@Override
	public boolean modifyCustomer(int custId) {
		
		return dao.modifyCustomer(custId);
	}

	@Override
	public boolean deleteCustomer(int custId) {
		
		return dao.deleteCustomer(custId);
	}

	@Override
	public CustomerBean getCustomer(int custId) {
		
		return dao.getCustomer(custId);
	}

}
