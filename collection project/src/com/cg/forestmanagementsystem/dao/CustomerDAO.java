package com.cg.forestmanagementsystem.dao;

import java.util.List;

import com.cg.forestmanagementsystem.bean.CustomerBean;

public interface CustomerDAO {
	public List<CustomerBean> getAllCustomer(CustomerBean bean);

	public boolean addCustomer(CustomerBean bean);

	public boolean modifyCustomer(int custId);

	public boolean deleteCustomer(int custId);

	CustomerBean getCustomer(int custId);

}
