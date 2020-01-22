package com.cg.springrestfsm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.AdminDao;
import com.cg.springrestfsm.dto.AdminBean;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao dao;
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	@Override
	public boolean register(AdminBean bean) {
		
		
			return dao.register(bean);
	}

	@Override
	public boolean changePassword(int admimId, String adminPassword) {
		
		 return dao.changePassword(admimId, encoder.encode(adminPassword));
	}

}
