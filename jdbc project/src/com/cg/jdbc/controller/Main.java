package com.cg.jdbc.controller;

import java.util.Scanner;



public class Main {
	public static void home1() {
		Scanner sc = new Scanner(System.in);
			System.out.println(" WELCOME TO FOREST MANAGEMENT SYSTEM");
		System.out.println("------------------------------------");
		System.out.println("Press 1 for Admin Login ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
		       Admin.main(null);
			break;
			default: break;
	}

}
}
