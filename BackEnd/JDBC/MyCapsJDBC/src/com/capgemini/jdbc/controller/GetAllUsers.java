package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserfFactory;
import com.capgemini.jdbc.services.UserServices;

public class GetAllUsers {

	public static void main(String[] args) {
		UserServices services=UserfFactory.intanceofUserservices();
		List<UserBean> list=services.getAllUsers();
		if(list!=null) {
			for(UserBean user:list) {
				System.out.println(user);
			}
		}
	}

}
