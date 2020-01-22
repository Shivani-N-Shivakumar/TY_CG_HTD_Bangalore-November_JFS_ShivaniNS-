package com.cg.jdbc.controller;

import java.util.List;
import java.util.Scanner;


import com.cg.jdbc.Validation.Validation;
import com.cg.jdbc.bean.ClientBean;
import com.cg.jdbc.bean.ContractBean;
import com.cg.jdbc.dao.ContractDao;
import com.cg.jdbc.exception.NotFoundException;
import com.cg.jdbc.factory.ContractFactory;
import com.cg.jdbc.service.ContractService;

public class Contract {

	public static void main() {

		Scanner sc = new Scanner(System.in);
		ContractBean bean = new ContractBean();
		ContractDao dao = ContractFactory.instanceOfContractDaoImpl();
		ContractService service = ContractFactory.instanceOfContractServiceImpl();

		while (true) {
			System.out.println("Press 1 to Insert Contract data");
			System.out.println("Press 2 to Delete Contract data");
			System.out.println("Press 3 to Get All Contract data");
			System.out.println("Press 4 to modify Contract Details");
			System.out.println("Press 5 to get Contract Details");
			System.out.println("press 6 to Go back to home page");
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
				System.out.println("Enter contract id to Modify Contract Details");

				String ch3 = null;
				boolean z = true;
				while (z) {
					ch3 = sc.next();
					if (Validation.isNumber(ch3)) {
						z = false;
					} else {
						System.err.println("Enter only numbers");
					}
				}
				int contractno= Integer.parseInt(ch3);
				bean.setContractNO(contractno);

				try {
					bean = service.getContractDetails(contractno);
					if (bean != null) {
						char d1 = 'y';
						while (d1 == 'y') {
							System.out.println("Enter new Delivery Date");
							String deliveryDate = sc.next();

							if (Validation.isValidDate(deliveryDate)) {
								d1 = 'n';
								bean.setDeliveryDate(deliveryDate);
							} else {
								System.err.println("Enter correct date format ");
							}
						}
						
					}
				} catch (NotFoundException e1) {
					System.err.println(e1.getMessage());
				}

				break;
			case 5:System.out.println("Enter contract number to get contract details");
			String ch1 = null;
			boolean h = true;
			while (h) {
				ch1 = sc.next();
				if (Validation.isNumber(ch1)) {
					h = false;

				} else {
					System.err.println("Enter only numbers");
				}
			}
			int contractnum = Integer.parseInt(ch1);
			bean.setContractNO(contractnum);;
			try {
				ContractBean bean1 = service.getContractDetails(contractnum);
				if (bean1 != null) {
					System.out.println("ContractBean [contractNO=" + bean1.getContractNO() + ", custId=" + bean1.getCustId() + ", haulId=" + bean1.getHaulId() + ", prodId="
							+ bean1.getProdId() + ", quantity=" + bean1.getQuantity() + ", deliveryDate=" + bean1.getDeliveryDate() + ", deliveryDay=" + bean1.getDeliveryDay()
							+ "]");
				}
			} catch (NotFoundException e2) {
				System.err.println(e2.getMessage());
			}
			break;
			case 6:
				Home.home();
				break;
			default:
				break;

			}
		}

	}

}
