package com.cg.springboot.dao;

import java.util.List;
import com.cg.springboot.dto.SchedulerBean;

public interface SchedulerDao {
	public boolean deleteScheduler(int scheduleid);

	public List<SchedulerBean> getScheduler();

	public boolean addScheduler(SchedulerBean bean);

	public boolean modifyScheduler(int scheduleid, SchedulerBean bean);

	public SchedulerBean searchScheduler(int scheduleid);
}
