package com.cg.hibernate;

import java.util.List;
import java.util.Scanner;

import com.cg.hibernate.dao.LandDao;
import com.cg.hibernate.dto.LandBean;
import com.cg.hibernate.factory.LandFactory;
import com.cg.hibernate.validation.Validation;




public class Land {
	public static void main() {
		LandDao dao = LandFactory.instanceOfLandDaoImpl();
		LandBean bean = new LandBean();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to Insert All the Land data");
			System.out.println("Press 2 to Delete the Land data");
			System.out.println("Press 3 to Get All Land details");
			System.out.println("press 4 for home");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				char ch = 'y';
				while (ch == 'y') {

					System.out.println("Enter Land id");

					String landid = sc.next();

					if (Validation.isNumber(landid)) {
						int landid1 = Integer.parseInt(landid);
						ch = 'n';
						bean.setLandId(landid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				System.out.println("Enter Land Owner Name");
				String name = sc.next();
				if (Validation.isStringOnlyAlphabet(name)) {
					ch = 'n';
					bean.setLandOwner(name);
				} else {
					System.err.println("Enter only alphabets");
				}
				
				System.out.println("Enter Land Cost");
				String cost = sc.next();
				if(Validation.isNumber(cost)) {
					int cost1 = Integer.parseInt(cost);
					ch = 'n';
					bean.setLandCost(cost1);
				} else {
					System.err.println("Enter only Numbers");
				}
				
				System.out.println("Enter Land in Arces");
				String arces = sc.next();
				if(Validation.isNumber(arces)) {
					int arces1 = Integer.parseInt(arces);
					ch = 'n';
					bean.setLandCost(arces1);
				} else {
					System.err.println("Enter only Numbers");
				}
				
			
				boolean check = dao.addLand(bean);
				if (check) {
					System.out.println("Product Added SuccessFully..");
				} else {
					System.err.println("Product Id is Repeated");
				}
				break;

			case 2:
				char b = 'y';
				while (b == 'y') {

					System.out.println("Enter Land id to be Deleted");

					String lid1 = sc.next();

					if (Validation.isNumber(lid1)) {
						int lid = Integer.parseInt(lid1);

						b = 'n';
						bean.setLandId(lid);
						boolean check2 = dao.deleteLand(lid);
						if (check2) {
							System.out.println("Product Deleted Successfully....");
						} else {
							System.err.println("Product not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}

				break;
			case 3:
				LandBean bean2 = new LandBean();
				List<LandBean> c1 = dao.getAllLand(bean2);
				System.out.println(c1);

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


