package com.cg.jdbc.controller;

import java.util.Scanner;

import com.cg.jdbc.Validation.Validation;
import com.cg.jdbc.bean.AdminBean;
import com.cg.jdbc.dao.AdminDao;
import com.cg.jdbc.factory.AdminFactory;
import com.cg.jdbc.service.AdminService;

public class Admin {
public static void main(String args[]) {
		
		AdminService services = AdminFactory.instanceOfAdminserviceImpl();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("FOREST MANAGEMENT SYSTEM");
		System.out.println("------------------------");
		System.out.println("WELCOME TO ADMIN PAGE");
		System.out.println("---------------------");
		while(true) {
			System.out.println("Enter the choice");
			System.out.println("1: To Login as Admin");
			System.out.println("2: To Go Back to Home Page");
		
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: AdminBean bean1 = new AdminBean();
			boolean v = true;
		
			while(v == true) {
				System.out.println("Enter Name");
				String username = sc.next();
				if (Validation.isStringOnlyAlphabet(username)) {

					v = false;
				bean1.setUsername(username);
				} else {
					System.err.println("Enter Alphabets only");
				}
			}
			
			boolean v1 = true;
			
			while(v1 == true) {
				System.out.println("Enter Password");
			String password = sc.next();
	bean1.setPassword(password);
		String username=null;
	
			
			boolean check =services.adminLogin(username, password);
			if(check) {
				
				System.out.println("Admin Logged in Successfully");
				Home.home();
			}else {
				System.out.println("enter correct details");
			}
			}
			break;
			case 2: Main.home1();
			break;
			
			
			default: System.err.println("Enter Correct Choice");
			break;
			
			}
		}
		
	}
}
