package com.cg.hibernate.factory;

import com.cg.hibernate.dao.HaulierDao;
import com.cg.hibernate.dao.HaulierDaoImpl;
import com.cg.hibernate.service.HaulierService;
import com.cg.hibernate.service.HaulierServiceImpl;

public class HaulierFactory {
	private HaulierFactory() {

	}

	public static HaulierDao instanceOfHaulierDaoImpl() {
		HaulierDao dao = new HaulierDaoImpl();
		return dao;
	}

	public static HaulierService instanceofHaulierServiceImpl() {
		HaulierService service = new HaulierServiceImpl();
		return service;
	}
}
