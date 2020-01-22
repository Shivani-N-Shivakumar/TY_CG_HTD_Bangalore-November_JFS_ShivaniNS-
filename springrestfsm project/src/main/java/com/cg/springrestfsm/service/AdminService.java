package com.cg.springrestfsm.service;

import com.cg.springrestfsm.dto.AdminBean;

public interface AdminService {
	public boolean register(AdminBean bean);
	public boolean changePassword(int admimId,String adminPassword);
}
