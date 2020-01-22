package com.cg.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.cg.jdbc.Validation.Validation;
import com.cg.jdbc.bean.ClientBean;
import com.cg.jdbc.dao.ClientDao;
import com.cg.jdbc.exception.NotFoundException;
import com.cg.jdbc.factory.ClientFactory;
import com.cg.jdbc.service.ClientService;

public class Client {

	public static void main() {
		ClientDao dao = ClientFactory.instanceOfClientDaoImpl();
		ClientService service = ClientFactory.instanceOfClientserviceImpl();
		ClientBean bean = new ClientBean();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to Get all the Client Data");
			System.out.println("Press 2 to Insert the Client Data");
			System.out.println("Press 3 to modify the Client Details");
			System.out.println("Press 4 to Delete the Client Data");
			System.out.println("Press 5 to search the Client Data");
			System.out.println("Press 6 to Go back to Home Page");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				List<ClientBean> c1 = dao.getAllClient(bean);

				System.out.println(c1);

				break;
			case 2:
				char a = 'y';
				while (a == 'y') {
					System.out.println("Enter Client id");

					String clid = sc.next();

					if (Validation.isNumber(clid)) {
						int clid1 = Integer.parseInt(clid);
						a = 'n';
						bean.setCustId(clid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				char b = 'y';
				while (b == 'y') {
					System.out.println("Enter the Client telephone number");
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

					System.out.println("Enter the Client Name");

					String cName = sc.next();
					if (Validation.isStringOnlyAlphabet(cName)) {

						c = 'n';
						bean.setcName(cName);
					} else {
						System.err.println("Enter Alphabets only");
					}
				}

				char l = 'y';
				while (l == 'y') {

					System.out.println("Enter the Street Address1");
					String sadd1 = sc.next();
					if (Validation.isStringOnlyAlphabet(sadd1)) {

						l = 'n';
						bean.setStad1(sadd1);
					} else {
						System.err.println("Enter Alphabets only");
					}
				}

				char k = 'y';
				while (k == 'y') {

					System.out.println("Enter Street Address2");
					String sadd2 = sc.next();
					if (Validation.isStringOnlyAlphabet(sadd2)) {

						k = 'n';
						bean.setStad2(sadd2);
					} else {
						System.err.println("Enter Alphabets only");
					}
				}

				char e = 'y';
				while (e == 'y') {

					System.out.println("Enter the Client Town");
					String town = sc.next();
					if (Validation.isStringOnlyAlphabet(town)) {

						e = 'n';
						bean.setTown(town);
					} else {
						System.err.println("Enter Alphabets only");
					}
				}

				boolean p = true;
				while (p == true) {
					System.out.println("enter Postal Code");
					String postalCode = sc.next();
					if (Validation.isValidPostalCode(postalCode)) {

						p = false;
						bean.setPostCode(postalCode);
					} else {
						System.err.println("Enter Correct 6 Digit PostalCode");
					}
				}

				char j = 'y';
				while (j == 'y') {

					System.out.println("Enter the Client Email");
					String email = sc.next();
					if (Validation.isValid(email)) {

						j = 'n';
						bean.setEmail(email);
					} else {
						System.err.println("Enter correct email");
					}
				}

				boolean check = dao.addClient(bean);
				if (check) {
					System.out.println("Client added Successfully.....");

				} else {
					System.err.println("Client id is not valid");
				}

				break;

			case 3:
				System.out.println("Enter client id to Modify Client Details");

				String ch = null;
				boolean z = true;
				while (z) {
					ch = sc.next();
					if (Validation.isNumber(ch)) {
						z = false;
					} else {
						System.err.println("Enter only numbers");
					}
				}
				int clientid = Integer.parseInt(ch);
				bean.setCustId(clientid);

				try {
					bean = service.getClientDetails(clientid);
					if (bean != null) {
						System.out.println("Enter new Telephone number ");
						bean.setTelNo(sc.nextLong());
						System.out.println("Enter new Street Address1");
						bean.setStad1(sc.next());
						System.out.println("Enter new Street Address2");
						bean.setStad2(sc.next());
						System.out.println("Enter new town name");
						bean.setTown(sc.next());
						System.out.println("Enter new postalcode");
						bean.setPostCode(sc.next());
						System.out.println("Enter new Email address");
						bean.setEmail(sc.next());
						service.modifyClient(bean);
						System.out.println("Client Details is Modified...");

					}
				} catch (NotFoundException e1) {
					System.err.println(e1.getMessage());
				}

				break;

			case 4:
				char g = 'y';
				while (g == 'y') {

					System.out.println("Enter Client id to be Deleted");

					String clid = sc.next();

					if (Validation.isNumber(clid)) {
						int clid1 = Integer.parseInt(clid);

						g = 'n';
						bean.setCustId(clid1);
						boolean check2 = dao.deleteClient(clid1);
						if (check2) {
							System.out.println("Client Deleted Successfully....");
						} else {
							System.err.println("Client not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}
				break;
			case 5:
				System.out.println("Enter client id to get client details");
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
				int clientid1 = Integer.parseInt(ch1);
				bean.setCustId(clientid1);
				try {
					ClientBean bean1 = service.getClientDetails(clientid1);
					if (bean1 != null) {
						System.out.println("CustomerBean [custId=" + bean1.getCustId() + ", telNo=" + bean1.getTelNo()
								+ ", cName=" + bean1.getcName() + ", stad1=" + bean1.getStad1() + ", stad2="
								+ bean1.getStad2() + ", town=" + bean1.getTown() + ", postCode=" + bean1.getPostCode()
								+ ", email=" + bean1.getEmail() + "]");
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
