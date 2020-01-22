package com.cg.jdbc.factory;

import com.cg.jdbc.dao.LandDao;
import com.cg.jdbc.dao.LandDaoImpl;
import com.cg.jdbc.service.LandService;
import com.cg.jdbc.service.LandServiceImpl;

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
