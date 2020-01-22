package com.cg.springboot.service;

import com.cg.springboot.dto.AdminBean;

public interface AdminService {
	public boolean register(AdminBean bean);

	public boolean changePassword(int admimId, String adminPassword);
}
