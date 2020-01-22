package com.cg.jdbc.factory;

import com.cg.jdbc.dao.HaulierDao;
import com.cg.jdbc.dao.HaulierDaoImpl;

import com.cg.jdbc.service.HaulierService;
import com.cg.jdbc.service.HaulierServiceImpl;

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
