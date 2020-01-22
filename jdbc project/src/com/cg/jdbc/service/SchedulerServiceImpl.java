package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.SchedulerBean;

import com.cg.jdbc.dao.SchedulerDao;

import com.cg.jdbc.factory.SchedulerFactory;

public class SchedulerServiceImpl implements SchedulerService{
	SchedulerDao dao = SchedulerFactory.instanceOfSchedulerDaoImpl();

	@Override
	public boolean addScheduler(SchedulerBean bean) {
		
		return dao.addScheduler(bean);
	}

	@Override
	public boolean deleteScheduler(int scheduleId) {
		
		return dao.deleteScheduler(scheduleId);
	}

	@Override
	public List<SchedulerBean> getAllScheduler(SchedulerBean bean) {
		
		return dao.getAllScheduler(bean);
	}

	@Override
	public boolean modifyScheduler(SchedulerBean bean) {
		
		return dao.modifyScheduler(bean);
	}

	@Override
	public SchedulerBean getSchedulerDetails(int scheduleId) {
		
		return dao.getSchedulerDetails(scheduleId);
	}

}
