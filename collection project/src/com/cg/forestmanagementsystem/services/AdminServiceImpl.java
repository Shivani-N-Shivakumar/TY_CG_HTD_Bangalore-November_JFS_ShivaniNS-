package com.cg.forestmanagementsystem.services;

import com.cg.forestmanagementsystem.dao.AdminDao;
import com.cg.forestmanagementsystem.util.AdminFactory;

public class AdminServiceImpl implements AdminService{
AdminDao dao = AdminFactory.instanceOfAdminDaoImpl();
	@Override
	public boolean adminLogin(String name, String password) {
		
		return dao.adminLogin(name,password);
	}

}
