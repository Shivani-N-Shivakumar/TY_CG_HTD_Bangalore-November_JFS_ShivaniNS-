package com.cg.forestmanagementsystem.util;

import com.cg.forestmanagementsystem.dao.AdminDao;
import com.cg.forestmanagementsystem.dao.AdminDaoImpl;
import com.cg.forestmanagementsystem.services.AdminService;
import com.cg.forestmanagementsystem.services.AdminServiceImpl;
;

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
