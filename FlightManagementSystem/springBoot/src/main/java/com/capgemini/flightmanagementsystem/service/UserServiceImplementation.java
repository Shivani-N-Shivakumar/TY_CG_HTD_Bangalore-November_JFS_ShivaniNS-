package com.capgemini.flightmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.flightmanagementsystem.dao.UserDao;
import com.capgemini.flightmanagementsystem.dto.User;

@Service
public class UserServiceImplementation implements UserService{

	@Autowired
	UserDao dao;
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	@Override
	public User login(String email, String password) {
		
		return dao.login(email, password);
	}

}
