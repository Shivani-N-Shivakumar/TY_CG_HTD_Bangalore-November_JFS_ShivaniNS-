package com.cg.jdbc.dao;

import java.util.List;

import com.cg.jdbc.bean.ProductBean;
import com.cg.jdbc.bean.SchedulerBean;



public interface SchedulerDao {

	boolean addScheduler(SchedulerBean bean);

	public boolean deleteScheduler(int scheduleId);

	public List<SchedulerBean> getAllScheduler(SchedulerBean bean);
	
	public boolean modifyScheduler(SchedulerBean bean);

	public SchedulerBean getSchedulerDetails(int scheduleId);
}
