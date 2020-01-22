package com.cg.jdbc.controller;

import java.util.List;
import java.util.Scanner;


import com.cg.jdbc.bean.HaulierBean;
import com.cg.jdbc.dao.HaulierDao;
import com.cg.jdbc.factory.HaulierFactory;


public class Haulier {
	public static void main() {

		Scanner sc = new Scanner(System.in);
		HaulierBean bean = new HaulierBean();
		HaulierDao dao = HaulierFactory.instanceOfHaulierDaoImpl();
		//HaulierService service = HaulierFactory.instanceofHaulierServiceImpl();

		while (true) {
			System.out.println("Press 1 to Insert Haulier data");
			System.out.println("Press 2 to Delete Haulier data");
			System.out.println("Press 3 to Get All Haulier data");
			System.out.println("press 4 to Go back to home page");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Haulier Id");
				int id = sc.nextInt();
				System.out.println("Enter the Haulier Telephone");
				long telNo = sc.nextInt();
				System.out.println("Enter Haulier Name");
				String name = sc.next();
				System.out.println("Enter street address1");
				String add1 = sc.next();
				System.out.println("Enter street address2");
				String add2 = sc.next();
				System.out.println("Enter Town");
				String town = sc.next();
				System.out.println("Enter Postal Code");
				String postcode = sc.next();
				System.out.println("Enter Email");
				String email = sc.next();

				bean.setHaulid(id);
				bean.setHtelno(telNo);
				bean.setHname(name);
				bean.setHstad1(add1);
				bean.setHstad2(add2);
				bean.setHtown(town);
				bean.setHpostcode(postcode);
				bean.setHemail(email);

				boolean check = dao.addHaulier(bean);
				if (check) {
					System.out.println("Haulier added Successfully....");
				} else {
					System.err.println("Haulier not added");
				}
				break;
			case 2:
				System.out.println("Enter Haulier Id to be Deleted");
				int id1 = sc.nextInt();
				boolean check1 = dao.deleteHaulier(id1);
				if (check1) {
					System.out.println("Haulier Deleted Successfully");
				} else {
					System.err.println("Haulier Not Found");
				}
				break;
			case 3:
				List<HaulierBean> c1 = dao.getAllHaulier(bean);
				
                
				System.out.println(c1);
				break;
//			case 4:
//				System.out.println("Enter Haulier id to Modify Haulier Details");
//
//				String ch3 = null;
//				boolean z = true;
//				while (z) {
//					ch3 = sc.next();
//					if (Validation.isNumber(ch3)) {
//						z = false;
//					} else {
//						System.err.println("Enter only numbers");
//					}
//				}
//				int haulid= Integer.parseInt(ch3);
//				bean.setHaulid(haulid);
//
//				try {
//					bean = service.getHaulierDetails(haulid);
//					if (bean != null) {
//						char d1 = 'y';
//						while (d1 == 'y') {
//							System.out.println("Enter new Delivery Date");
//							String deliveryDate = sc.next();
//
//							if (Validation.isValidDate(deliveryDate)) {
//								d1 = 'n';
//								bean.setDeliveryDate(deliveryDate);
//							} else {
//								System.err.println("Enter correct date format ");
//							}
//						}
//						
//					}
//				} catch (NotFoundException e1) {
//					System.err.println(e1.getMessage());
//				}
//
//				break;
			case 4:
			case 5:
				Home.home();
				break;
			default:
				break;
			}
		}

	}
}
