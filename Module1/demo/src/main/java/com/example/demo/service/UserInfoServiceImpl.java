package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.dto.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	
	@Autowired
	private UserInfoDao dao;

	@Override
	public boolean Profile(UserInfo user) {
		
		return dao.Profile(user);
	}

	@Override
	public UserInfo login(String email, String password) {
		
		return dao.login(email, password);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		
		return dao.updatePassword(id, password);
	}

}
