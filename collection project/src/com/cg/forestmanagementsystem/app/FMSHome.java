package com.cg.forestmanagementsystem.app;

import java.util.Scanner;

public class FMSHome {

	public static void home() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" WELCOME TO FOREST MANAGEMENT SYSTEM");
		System.out.println("------------------------------------");
		System.out.println("Press 1 for Contract");
		System.out.println("Press 2 for Customer");
		System.out.println("Press 3 for Product");
		System.out.println("Press 4 for Haulier");
		System.out.println("Press 5 for Client");
		System.out.println("Press 6 for Order");
		System.out.println("Press 7 to go back to Admin Page");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Contract.main(null);
			break;
		case 2:
			Customer.main(null);
			break;
		case 3:
			Product.main(null);
			break;
		case 4:
			Haulier.main(null);
			break;
		case 5:
			Client.main(null);
			break;
		case 6:
			Order.main (null);
			break;
		case 7: 
			LoginPage.main(null);
		default:
			break;
		}

	}

}
