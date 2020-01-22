package com.cg.hibernate;

import java.util.Scanner;



public class Home {
	public static void home() {
		Scanner sc = new Scanner(System.in);
		System.out.println("FOREST MANAGEMENT SYSTEM");
		System.out.println("------------------------");
		System.out.println("Press 1 for Contract");
		System.out.println("Press 2 for Client");
		System.out.println("Press 3 for Haulier");
		System.out.println("Press 4 for Order");
		System.out.println("Press 5 for Product");
		System.out.println("Press 6 for Land");
		System.out.println("Press 7 to go back to Admin Page");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Contract.main();
			break;
		case 2:
			Client.main();
			break;
		case 3:
			Haulier.main();
			break;
		case 4:
			Order.main();
			break;
		case 5:
			Product.main();
			break;
		case 6:
			Land.main();
			break;
		case 7:
			AdminMain.main(null);
		default:
			break;
		}

	}

}
