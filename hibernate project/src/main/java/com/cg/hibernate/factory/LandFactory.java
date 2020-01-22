package com.cg.hibernate.factory;

import com.cg.hibernate.dao.LandDao;
import com.cg.hibernate.dao.LandDaoImpl;
import com.cg.hibernate.service.LandService;
import com.cg.hibernate.service.LandServiceImpl;

public class LandFactory {
	private LandFactory() {

	}

	public static LandDao instanceOfLandDaoImpl() {
		LandDao dao = new LandDaoImpl();
		return dao;
	}

	public static LandService instanceOfLandServiceImpl() {
		LandService service = new LandServiceImpl();
		return service;
	}
}
