package com.cg.filpkart.controller;

import java.util.Scanner;



public class Home {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("FLIPKART (The Shopping Application)");
		System.out.println("---------------------------");
		while(true)
		{
		System.out.println("Press 1 to Show All The Products");
		System.out.println("Press 2 to Search for Product");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:ShowAll.main1();
	           break;
		case 2:Search.main2();
	            break;
		
			default:break;
		}


	}

}
}
