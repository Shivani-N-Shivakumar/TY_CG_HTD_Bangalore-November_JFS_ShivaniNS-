package com.cg.springrestfsm.service;

import java.util.List;

import com.cg.springrestfsm.dto.SchedulerBean;

public interface SchedulerService {
	public boolean deleteScheduler(int scheduleid);

	public List<SchedulerBean> getScheduler();

	public boolean addScheduler(SchedulerBean bean);

	public boolean modifyScheduler(int scheduleid, SchedulerBean bean);

	public SchedulerBean searchScheduler(int scheduleid);
}
