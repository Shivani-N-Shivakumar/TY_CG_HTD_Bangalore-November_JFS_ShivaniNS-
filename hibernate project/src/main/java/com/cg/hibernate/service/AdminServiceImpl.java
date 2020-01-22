package com.cg.hibernate.service;

import com.cg.hibernate.dao.AdminDao;
import com.cg.hibernate.factory.AdminFactory;

public class AdminServiceImpl implements AdminService{
	AdminDao dao = AdminFactory.instanceOfAdminDaoImpl();

	@Override
	public boolean adminLogin(String adminName, String adminPassword) {
		
		return dao.adminLogin(adminName, adminPassword);
	}

}
