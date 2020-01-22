package com.cg.forestmanagementsystem.app;

import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.CustomerBean;
import com.cg.forestmanagementsystem.bean.ProductBean;
import com.cg.forestmanagementsystem.dao.ProductDAO;
import com.cg.forestmanagementsystem.util.ProductFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class Product {
	public static void main(String[] args) {
		ProductDAO dao = ProductFactory.instanceOfProductDaoImpl();

		Scanner sc = new Scanner(System.in);
		ProductBean bean = new ProductBean();
		;

		while (true) {
			System.out.println("Press 1 to Insert All the Product data");
			System.out.println("Press 2 to Delete the Product data");
			System.out.println("Press 3 to Get All Product details");
			System.out.println("press 4 for home");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:

				char ch = 'y';
				while (ch == 'y') {

					System.out.println("Enter Product id");

					String pid1 = sc.next();

					if (Validation.isNumber(pid1)) {
						int pid = Integer.parseInt(pid1);
						ch = 'n';
						bean.setProId(pid);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				System.out.println("Enter Product name");
				String name = sc.next();
				if (Validation.isStringOnlyAlphabet(name)) {
					ch = 'n';
					bean.setPname(name);
				} else {
					System.err.println("Enter only alphabets");
				}
				System.out.println("Enter Product description");
				String desc = sc.next();

				bean.setPdesc(desc);

				boolean check = dao.addProduct(bean);
				if (check) {
					System.out.println("Product Added SuccessFully..");
				} else {
					System.err.println("Product Id is Repeated");
				}
				break;
//			case 2:char a = 'y';
//			while(a == 'y') {
//				
//				System.out.println("Enter Product id");
//				
//				String pid= sc.next();
//			
//				
//				if(Validation.isNumber(pid)) {
//					int pid1 =Integer.parseInt(pid);
//					ch = 'n';
//					bean.setProId(pid);
//				}else {
//					System.err.println("Enter only Numbers");
//				}
//			}
//			
//				boolean check1 = dao.modifyProduct(pid);
//				if (check1) {
//					System.out.println("Product modified Successfully.....");
//				} else {
//					System.err.println("Product not Added");
//				}
//				break;
			case 2:
				char b = 'y';
				while (b == 'y') {

					System.out.println("Enter Product id to be Deleted");

					String pid1 = sc.next();

					if (Validation.isNumber(pid1)) {
						int pid = Integer.parseInt(pid1);

						b = 'n';
						bean.setProId(pid);
						boolean check2 = dao.deleteProduct(pid);
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
				ProductBean bean2 = new ProductBean();
				List<ProductBean> c1 = dao.getAllProduct(bean2);
				System.out.println(c1);

				break;
			case 5:
				FMSHome.home();;
				break;

			default:
				break;
			}
		}

	}

}
