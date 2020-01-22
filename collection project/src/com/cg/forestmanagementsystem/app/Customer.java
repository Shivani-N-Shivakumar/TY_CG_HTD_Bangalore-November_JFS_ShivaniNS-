package com.cg.forestmanagementsystem.app;

import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.CustomerBean;
import com.cg.forestmanagementsystem.dao.CustomerDAO;
import com.cg.forestmanagementsystem.util.CustomerFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class Customer {

	public static void main(String[] args) {
		CustomerDAO dao = CustomerFactory.instanceOfCustomerDaoImpl();
		CustomerBean bean = new CustomerBean();
		;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to Get all the Customer Data");
			System.out.println("Press 2 to Insert the Customer Data");
			System.out.println("Press 3 to Delete the Customer Data");
			System.out.println("Press 4 to Go back to Home Page");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				List<CustomerBean> c1 = dao.getAllCustomer(bean);

				System.out.println(c1);

				break;
			case 2:
				char a = 'y';
				while (a == 'y') {
					System.out.println("Enter Customer id");

					String custid = sc.next();

					if (Validation.isNumber(custid)) {
						int custid1 = Integer.parseInt(custid);
						a = 'n';
						bean.setCustId(custid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				char b = 'y';
				while (b == 'y') {
					System.out.println("Enter the customer telephone number");
					String telNo = sc.next();
					if (Validation.isValidTel(telNo)) {
						long telNo1 = Long.parseLong(telNo);
						b = 'n';
						bean.setTelNo(telNo1);
					} else {
						System.err.println("Enter Correct telephone number");
					}
				}

				char c = 'y';
				while (c == 'y') {

					System.out.println("Enter the Customer Name");

					String cName = sc.next();
					if (Validation.isStringOnlyAlphabet(cName)) {

						c = 'n';
						bean.setCName(cName);
					} else {
						System.err.println("Enter Alphabets only");
					}
				}

				char e = 'y';
				while (e == 'y') {

					System.out.println("Enter the Customer Town");
					String town = sc.next();
					if (Validation.isStringOnlyAlphabet(town)) {

						e = 'n';
						bean.setTown(town);
					} else {
						System.err.println("Enter Alphabets only");
					}
				}

				System.out.println("Enter the Customer Postal Code");
				String postcode = sc.next();

				char d = 'y';
				while (d == 'y') {

					System.out.println("Enter the Customer Email");
					String email = sc.next();
					if (Validation.isValid(email)) {

						d = 'n';
						bean.setEmail(email);
					} else {
						System.err.println("Enter correct email");
					}
				}

				boolean check = dao.addCustomer(bean);
				if (check) {
					System.out.println("Customer added Successfully.....");

				} else {
					System.out.println("customer id is not valid");
				}

				break;

//		case 3:CustomerBean bean2 = new CustomerBean();
//		 boolean idmatcher2;
//	       do {
//	       System.out.println("Enter Customer id to modify");
//	       System.out.println("Id should contain 4 numbers....");
//	       int cid = sc.nextInt();
//	       String id3=Integer.toString(cid);
//	      
//	       String idregexpr2 = "^[1-9][0-9] {3}$";
//	       idmatcher2 = id3.matches(idregexpr2);
//	       
//	       if(!idmatcher2)
//	    	   System.out.println("Invalid id");
//	       else {
//	    	   bean2.setCustId(cid);
//	       }
//	       }while(!idmatcher2);
//	       
//	       boolean nummatcher1;
//	       do {
//	    	   System.out.println("Enter the customer telephone number");
//	    	   long telNo = sc.nextLong();
//	    	   String num = Long.toString(telNo);
//	    	   String phoneNum = "^[6-9][0-9] {9}$";
//	    	   nummatcher = num.matches(phoneNum);
//	    	   if(!nummatcher1)
//	    		   System.out.println("Invalid number....");
//	    	   else {
//	    		   bean2.setTelNo(telNo);
//	    	   }
//	       }while(!nummatcher1);
//	       
//	       
//	       boolean flag1;
//	       do {
//	    	   String nameregexpr = "^[A-Z][a-z]*";
//	    	   
//	       
//	       
//	System.out.println("Enter the Customer Name");
//	System.out.println("Enter the name in capitalised format");
//	
//	String cName = sc.next();
//	flag1=cName.matches(nameregexpr);
//	if(!flag1)
//		System.out.println("Invalid.....please Enter alphabets Only");
//	else {
//		bean2.setCName(cName);
//	}
//	       }while(!flag1);
//	       
//	       
//	       
//	       boolean townmatcher1;
//	       do {
//	    	   
//	System.out.println("Enter the Customer Town");
//	String town = sc.next();
//	String townregexpr = "^[A-Za-z]*";
//	townmatcher1 = town.matches(townregexpr);
//	if(!townmatcher1)
//		System.out.println("Invalid town name");
//	else {
//		bean2.setTown(town);
//	}
//	       }while(!townmatcher1);
//	       
//	       boolean postmatcher2;
//	       do {
//	    	   
//	       
//	System.out.println("Enter the Customer Postal Code");
//	int postcode = sc.nextInt();
//	String postalcode = Integer.toString(postcode);
//	String post1 = "^[1-9][0-9] {5}$";
//	postmatcher2 = postalcode.matches(post1);
//	if(!postmatcher2)
//		System.out.println("Invalid postal code");
//	else {
//		bean2.setPostCode(postcode);
//	}
//	       }while(!postmatcher2);
//	       
//	       
//	       boolean emailmatcher1;
//	       do {
//	    	   
//	     
			// System.out.println("Enter the Customer Email");
//String email = sc.next();
//	String email1 = "^(.+)@(.+)$";
//	emailmatcher1 = email.matches(email1);
//	if(!emailmatcher1)
//		System.out.println("invalid email");
//	else {
			// bean2.setEmail(email);
//	}
//	       }while(!emailmatcher1);
//
//	
//	
//	       //int id4=Integer.parseInt(id3);
//		
			// boolean check1 = dao.modifyCustomer(id4);
			// if(check1)
			// {
			// System.out.println("customer modified successfully");
			// }else {
			// System.out.println("customer not modified");
			// }
			// break;
			case 3:
				char g = 'y';
				while (g == 'y') {

					System.out.println("Enter Customer id to be Deleted");

					String custid = sc.next();

					if (Validation.isNumber(custid)) {
						int custid1 = Integer.parseInt(custid);

						g = 'n';
						bean.setCustId(custid1);
						boolean check2 = dao.deleteCustomer(custid1);
						if (check2) {
							System.out.println("Customer Deleted Successfully....");
						} else {
							System.err.println("Customer not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}
				break;
			case 4:
				FMSHome.home();
				break;
			default:
				break;
			}
		}

	}
}
