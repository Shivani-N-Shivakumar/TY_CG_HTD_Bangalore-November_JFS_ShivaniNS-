package com.cg.hibernate.factory;

import com.cg.hibernate.dao.AdminDao;
import com.cg.hibernate.dao.AdminDaoImpl;
import com.cg.hibernate.service.AdminService;
import com.cg.hibernate.service.AdminServiceImpl;

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
