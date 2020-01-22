package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.SchedulerBean;

public interface SchedulerService {
	boolean addScheduler(SchedulerBean bean);

	public boolean deleteScheduler(int scheduleId);

	public List<SchedulerBean> getAllScheduler(SchedulerBean bean);
	
	public boolean modifyScheduler(SchedulerBean bean);

	public SchedulerBean getSchedulerDetails(int scheduleId);
}
