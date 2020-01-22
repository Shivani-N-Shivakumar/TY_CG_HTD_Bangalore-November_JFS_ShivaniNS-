package com.cg.forestmanagementsystem.app;

import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.OrderBean;
import com.cg.forestmanagementsystem.dao.OrderDao;
import com.cg.forestmanagementsystem.util.OrderFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class Order {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        OrderDao dao = OrderFactory.instanceOfOrderDaoImpl();

		OrderBean bean = new OrderBean();
		
		while (true) {
			System.out.println("Press 1 to Insert Order data");
			System.out.println("Press 2 to Delete Order data");
			System.out.println("Press 3 to Get All Order data");
			System.out.println("press 4 to Go back to home page");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				char ch = 'y';
				while (ch == 'y') {

					System.out.println("Enter Order Number");

					String ordnum = sc.next();

					if (Validation.isNumber(ordnum)) {
						int ordnum1 = Integer.parseInt(ordnum);
						ch = 'n';
						bean.setOrderno(ordnum1);
					} else {
						System.err.println("Enter only Numbers");
					}

				}
				char a = 'y';
				while (a == 'y') {
					System.out.println("Enter Customer id");

					String custid = sc.next();

					if (Validation.isNumber(custid)) {
						int custid1 = Integer.parseInt(custid);
						a = 'n';
						bean.setCustid(custid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				

				char c = 'y';
				while (c == 'y') {

					System.out.println("Enter Haulier id");

					String haulid = sc.next();

					if (Validation.isNumber(haulid)) {
						int haulid1 = Integer.parseInt(haulid);
						c = 'n';
						bean.setHaulid(haulid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}
				
				char b = 'y';
				while (b == 'y') {
					System.out.println("Enter Product id");

					String prodid = sc.next();

					if (Validation.isNumber(prodid)) {
						int prodid1 = Integer.parseInt(prodid);
						b = 'n';
						bean.setProdid(prodid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}
				char i = 'y';
				while (i == 'y') {
					System.out.println("Enter  Quantity");

					String quant = sc.next();

					if (Validation.isNumber(quant)) {
						int quant1 = Integer.parseInt(quant);
						b = 'n';
						bean.setQuantity(quant1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				char d = 'y';
				while (d == 'y') {
					System.out.println("Enter Delivery Date");
					String deliveryDate = sc.next();

					if (Validation.isValidDate(deliveryDate)) {
						d = 'n';
						bean.setDeliverydate(deliveryDate);
					} else {
						System.err.println("Enter correct date format ");
					}
				}

				
				boolean check = dao.addOrder(bean);
				if (check) {
					System.out.println("Order added Successfully....");
				} else {
					System.err.println("Order not added");
				}

				break;

			case 2:
				char f = 'y';
				while (f == 'y') {

					System.out.println("Enter Order Number to be Deleted");

					String orderno = sc.next();

					if (Validation.isNumber(orderno)) {
						int orderno1 = Integer.parseInt(orderno);

						f = 'n';
						bean.setOrderno(orderno1);
						boolean check2 = dao.deleteOrder(orderno1);
						if (check2) {
							System.out.println("Order Deleted Successfully....");
						} else {
							System.err.println("Order not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}
                 break;
			case 3:

				List<OrderBean> c1 = dao.getAllOrder(bean);

				System.out.println(c1);

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
