package com.cg.jdbc.factory;

import com.cg.jdbc.dao.AdminDao;
import com.cg.jdbc.dao.AdminDaoImpl;
import com.cg.jdbc.service.AdminService;
import com.cg.jdbc.service.AdminServiceImpl;

public class AdminFactory {
	private AdminFactory() {

	}

	public static AdminDao instanceOfAdminDaoImpl() {
		AdminDao dao = new AdminDaoImpl();
		return dao;
	}

	public static AdminService instanceOfAdminserviceImpl() {
		AdminService services = new AdminServiceImpl();
		return services;
	}
}
