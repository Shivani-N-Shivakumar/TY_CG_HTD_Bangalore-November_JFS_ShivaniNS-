package com.cg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.dao.SchedulerDao;
import com.cg.springboot.dto.SchedulerBean;

@Service
public class SchedulerServiceImpl implements SchedulerService {
	@Autowired
	private SchedulerDao dao;

	@Override
	public boolean deleteScheduler(int scheduleid) {

		return dao.deleteScheduler(scheduleid);
	}

	@Override
	public List<SchedulerBean> getScheduler() {

		return dao.getScheduler();
	}

	@Override
	public boolean addScheduler(SchedulerBean bean) {

		return dao.addScheduler(bean);
	}

	@Override
	public boolean modifyScheduler(int scheduleid, SchedulerBean bean) {

		return dao.modifyScheduler(scheduleid, bean);
	}

	@Override
	public SchedulerBean searchScheduler(int scheduleid) {

		return dao.searchScheduler(scheduleid);
	}

}
