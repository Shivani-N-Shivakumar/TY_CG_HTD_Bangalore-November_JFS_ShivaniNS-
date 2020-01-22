 package com.cg.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.springboot.dao.AdminDao;
import com.cg.springboot.dto.AdminBean;


@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao dao;
	

	@Override
	public boolean register(AdminBean bean) {
		
		return dao.register(bean);
	}

	@Override
	public boolean changePassword(int admimId, String adminPassword) {
	
		 return dao.changePassword(admimId, adminPassword);
	}

	
	
}
