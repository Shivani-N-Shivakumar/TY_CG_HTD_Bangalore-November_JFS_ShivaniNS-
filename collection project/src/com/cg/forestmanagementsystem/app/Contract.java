package com.cg.forestmanagementsystem.app;

import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.ContractBean;
import com.cg.forestmanagementsystem.dao.ContractDAO;
import com.cg.forestmanagementsystem.util.ContractFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class Contract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ContractDAO dao = ContractFactory.instanceOfContractDaoImpl();

		ContractBean bean = new ContractBean();
		
		while (true) {
			System.out.println("Press 1 to Insert Contract data");
			System.out.println("Press 2 to Delete Contract data");
			System.out.println("Press 3 to Get All Contract data");
			System.out.println("press 4 to Go back to home page");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				char ch = 'y';
				while (ch == 'y') {

					System.out.println("Enter Contract Number");

					String contnum = sc.next();

					if (Validation.isNumber(contnum)) {
						int contnum1 = Integer.parseInt(contnum);
						ch = 'n';
						bean.setContractNO(contnum1);
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
						bean.setCustId(custid1);
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
						bean.setProdId(prodid1);
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
						bean.setHaulId(haulid1);
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
						bean.setDeliveryDate(deliveryDate);
					} else {
						System.err.println("Enter correct date format ");
					}
				}

				char e = 'y';
				while (e == 'y') {

					System.out.println("Enter Delivery Day");
					String day = sc.next();
					if (Validation.isStringOnlyAlphabet(day)) {
						e = 'n';
						bean.setDeliveryDay(day);
					} else {
						System.err.println("Enter Alphabets Only");
					}

				}
				boolean check = dao.addContract(bean);
				if (check) {
					System.out.println("Contract added Successfully....");
				} else {
					System.err.println("Contract not added");
				}

				break;

			case 2:
				char f = 'y';
				while (f == 'y') {

					System.out.println("Enter Contract Number to be Deleted");

					String contno = sc.next();

					if (Validation.isNumber(contno)) {
						int contno1 = Integer.parseInt(contno);

						f = 'n';
						bean.setContractNO(contno1);
						boolean check2 = dao.deleteContract(contno1);
						if (check2) {
							System.out.println("Contract Deleted Successfully....");
						} else {
							System.err.println("Contract not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}
                 break;
			case 3:

				List<ContractBean> c1 = dao.getAllContract(bean);

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