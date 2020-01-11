package com.example.demo.service;

import com.example.demo.dto.UserInfo;

public interface UserInfoService {
	public boolean Profile(UserInfo user);
	public UserInfo login(String email,String password);
	public boolean updatePassword(int id,String password);
}
