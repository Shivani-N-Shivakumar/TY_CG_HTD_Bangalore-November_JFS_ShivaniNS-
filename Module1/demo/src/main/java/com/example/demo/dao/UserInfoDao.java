package com.example.demo.dao;

import com.example.demo.dto.UserInfo;

public interface UserInfoDao {
	public boolean Profile(UserInfo user);
	public UserInfo login(String email,String password);
	public boolean updatePassword(int id,String password);
}
