package com.cg.hibernate;

import java.util.Scanner;


import com.cg.hibernate.dto.Admin;
import com.cg.hibernate.factory.AdminFactory;
import com.cg.hibernate.service.AdminService;
import com.cg.hibernate.validation.Validation;



public class AdminMain {
	public static void main(String args[]) {
		
		AdminService services = AdminFactory.instanceOfAdminserviceImpl();
		
		@SuppressWarnings("resource")
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
			case 1: Admin b = new Admin();
			boolean v = true;
		
			while(v == true) {
				System.out.println("Enter Name");
				String adminName = sc.next();
				if (Validation.isStringOnlyAlphabet(adminName)) {

					v = false;
					b.setAdminName(adminName);
				} else {
					System.err.println("Enter Alphabets only");
				}
			
			
			
			
	
				System.out.println("Enter Password");
			String adminPassword = sc.next();
			b.setAdminPassword(adminPassword);
		
	
			
			boolean check =services.adminLogin(adminName, adminPassword);
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

