package com.capgemini.flightmanagementsystem.dao;



import com.capgemini.flightmanagementsystem.dto.User;

public interface UserDao {

	public User login(String email,String password);

	
}
