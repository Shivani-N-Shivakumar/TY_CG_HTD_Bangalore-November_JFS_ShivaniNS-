package com.cg.forestmanagementsystem.util;


import com.cg.forestmanagementsystem.dao.HaulierDao;
import com.cg.forestmanagementsystem.dao.HaulierDaoImpl;

import com.cg.forestmanagementsystem.services.HaulierService;
import com.cg.forestmanagementsystem.services.HaulierServiceImpl;

public class HaulierFactory {
	private HaulierFactory() {

	}

	public static HaulierDao instanceOfHaulierDaoImpl() {
		HaulierDao dao = new HaulierDaoImpl();
		return dao;
	}

	public static HaulierService instanceOfHaulierserviceImpl() {
		HaulierService services = new HaulierServiceImpl();
		return services;
	}
}
