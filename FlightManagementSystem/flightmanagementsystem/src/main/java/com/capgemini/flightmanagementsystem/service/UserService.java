package com.capgemini.flightmanagementsystem.service;

import com.capgemini.flightmanagementsystem.dto.User;

public interface UserService {
	
	public User login(String email,String password);

}
