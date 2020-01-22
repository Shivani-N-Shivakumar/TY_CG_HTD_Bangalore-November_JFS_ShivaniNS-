package com.cg.jdbc.service;

import com.cg.jdbc.bean.AdminBean;
import com.cg.jdbc.dao.AdminDao;
import com.cg.jdbc.factory.AdminFactory;

public class AdminServiceImpl implements AdminService{
AdminDao dao = AdminFactory.instanceOfAdminDaoImpl();
	@Override
	public boolean adminLogin(String username, String password) {
		
		return dao.adminLogin(username, password);
	}

}



