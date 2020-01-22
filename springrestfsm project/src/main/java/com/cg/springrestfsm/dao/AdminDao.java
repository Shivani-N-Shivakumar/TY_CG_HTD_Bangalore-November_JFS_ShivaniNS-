package com.cg.springrestfsm.dao;

import com.cg.springrestfsm.dto.AdminBean;

public interface AdminDao {
	public boolean register(AdminBean bean);
	public boolean changePassword(int admimId,String adminPassword);
}
