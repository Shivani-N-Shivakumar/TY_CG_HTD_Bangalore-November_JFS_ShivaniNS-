package com.cg.forestmanagementsystem.dao;

public class AdminDaoImpl implements AdminDao {

	@Override
	public boolean adminLogin(String name, String password) {
		String Username = "Shivani";
		String Password = "Pr@meel@123";
		if (name.contentEquals(Username)) {
			if (password.contentEquals(Password)) {
				System.out.println("Login Successfull");
				return true;
			}
		}

		System.out.println("Try Again with some Username and Password");
		return false;
	}

}
