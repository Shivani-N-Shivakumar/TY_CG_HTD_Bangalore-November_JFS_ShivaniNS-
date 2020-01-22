package com.cg.hibernate;

import java.util.List;
import java.util.Scanner;

import com.cg.hibernate.dao.HaulierDao;
import com.cg.hibernate.dto.HaulierBean;
import com.cg.hibernate.factory.HaulierFactory;



public class Haulier {
	public static void main() {

		Scanner sc = new Scanner(System.in);
		HaulierBean bean = new HaulierBean();
		HaulierDao dao = HaulierFactory.instanceOfHaulierDaoImpl();

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
				int telNo = sc.nextInt();
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
				if (c1 != null) {
					for (HaulierBean con : c1) {
						System.out.println(con);
					}
				} else {
					System.err.println("Haulier Not Found");
				}
				break;
//			case 4:
//				Home.home();
//				break;
			default:
				break;
			}
		}

	}
}
