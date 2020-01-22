package com.cg.forestmanagementsystem.app;

import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.AdminBean;
import com.cg.forestmanagementsystem.dao.AdminDao;
import com.cg.forestmanagementsystem.util.AdminFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class LoginPage {

	public static void main(String args[]) {
		AdminDao dao = AdminFactory.instanceOfAdminDaoImpl();
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
			case 1: AdminBean b = new AdminBean();
			boolean v = true;
			String name=null;
			while(v == true) {
				System.out.println("Enter Name");
				 name = sc.next();
				if (Validation.isStringOnlyAlphabet(name)) {

					v = false;
					b.setName(name);
				} else {
					System.err.println("Enter Alphabets only");
				}
			}
			
			boolean v1 = true;
			String password=null;
			while(v1 == true) {
				System.out.println("Enter Password");
			 password = sc.next();
				if(Validation.calculatePasswordStrength(password)==10) {
					v1 = false;
					b.setPassword(password);
					
					
				}else {
					System.err.println("Enter correct format....\n(Should contain min one uppercase, one Lowercase,\n one special Character,one numeric and 8 digits)");
					
				}
			}
			
			boolean b1 = dao.adminLogin(name,password);
			if(b1) {
				System.out.println("Admin Logged in Successfully\n");
				System.out.println("-------------------------------");
				FMSHome.home();
			}else {
				System.err.println("Admin not LoggedIn....Please Try again");
			}
			break;
			case 2: Home.home1();
			break;
			
			
			default: System.err.println("Enter Correct Choice");
			break;
			
			}
		}
		
	}
}

	