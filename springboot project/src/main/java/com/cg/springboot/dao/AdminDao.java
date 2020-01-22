package com.cg.springboot.dao;

import com.cg.springboot.dto.AdminBean;

public interface AdminDao {
	public boolean register(AdminBean bean);

	public boolean changePassword(int admimId, String adminPassword);
}
