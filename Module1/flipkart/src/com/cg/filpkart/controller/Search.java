package com.cg.filpkart.controller;

import java.util.List;
import java.util.Scanner;


import com.cg.flipkart.bean.ProductBean;
import com.cg.flipkart.factory.ProductFactory;
import com.cg.flipkart.service.ProductService;

public class Search {

	public static void main2() {
		ProductService service=ProductFactory.instanceOfProductServiceImpl();
		Scanner sc=new Scanner(System.in);
		List<ProductBean> l1=service.getAllProduct();
		System.out.println("search the product");
		System.out.println("Enter the product name");
		String p=sc.next();
		

		List<ProductBean> b=service.searchProduct(p);
		System.out.println(b);
		while(true) {
			System.out.println("Press 1 to Buy the Product");
			System.out.println("Press 2 to Search Again");
			System.out.println("Press 3 to Go Back To Last Menu");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:List<ProductBean> l2=service.getAllProduct();
			System.out.println("search the contact");
			System.out.println("Enter the contact name");
			String p1=sc.next();
			List<ProductBean> b1=service.searchProduct(p1);
			System.out.println(b1);
			if(b1 != null) {
				System.out.println("Payment");
				System.out.println("Enter Product Id");
				int id=sc.nextInt();
				System.out.println("Enter 16 digit card number");
				int num=sc.nextInt();
				System.out.println("Enter 3 digit CVV");
				int cvv=sc.nextInt();
				System.out.println("Payment is Done..../n Product will Delivery within in 3 or 4 working Day");
			
			}else {
				System.out.println("Payment Not Done");
			}
	           break;
		  case 2:List<ProductBean> l3=service.getAllProduct();
				System.out.println("search the contact");
				System.out.println("Enter the contact name");
				String p3=sc.next();
				List<ProductBean> b3=service.searchProduct(p3);
				System.out.println(b3);
				
				break;
		  case 3:Home.main(null);
		  break;
		  default:break;
			}
			}
		}

	}


