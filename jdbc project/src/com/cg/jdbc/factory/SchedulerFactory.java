package com.cg.jdbc.factory;


import com.cg.jdbc.dao.SchedulerDao;
import com.cg.jdbc.dao.SchedulerDaoImpl;
import com.cg.jdbc.service.SchedulerService;
import com.cg.jdbc.service.SchedulerServiceImpl;

public class SchedulerFactory {
	private SchedulerFactory() {

	}

	public static SchedulerDao instanceOfSchedulerDaoImpl() {
		SchedulerDao dao = new SchedulerDaoImpl();
		return dao;
	}

	public static SchedulerService instanceOfSchedulerServiceImpl() {
		SchedulerService service = new SchedulerServiceImpl();
		return service;
	}
}
