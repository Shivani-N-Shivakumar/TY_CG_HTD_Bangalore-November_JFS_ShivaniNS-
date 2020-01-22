package com.cg.forestmanagementsystem.app;

import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.ClientBean;
import com.cg.forestmanagementsystem.dao.ClientDao;
import com.cg.forestmanagementsystem.services.ClientService;
import com.cg.forestmanagementsystem.util.ClientFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class Client {
	public static void main(String[] args) {
	
		ClientDao dao = ClientFactory.instanceOfClientDaoImpl();
		ClientService service = ClientFactory.instanceOfClientserviceImpl();
		ClientBean bean = new ClientBean();
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 1 to Get all the Client Data");
			System.out.println("Press 2 to Insert the Client Data");
			System.out.println("Press 3 to Delete the Client Data");
			System.out.println("Press 4 to Modify the Client Data");
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
						bean.setCliId(clid1);
					} else {
						System.err.println("Enter only Numbers");
					}
				}

				char b = 'y';
				while (b == 'y') {
						System.out.println("Enter the Client telephone number");
						String telNo = sc.next();
						if(Validation.isValidTel(telNo)) {
							long telNo1 = Long.parseLong(telNo);
							b = 'n';
							bean.setTelNo(telNo1);
						}else {
							System.err.println("Enter Correct telephone number");
						}
				}

				char c = 'y';
				while (c == 'y') {

					System.out.println("Enter the Client Name");

					String cName = sc.next();
					if (Validation.isStringOnlyAlphabet(cName)) {

						c = 'n';
						bean.setCliName(cName);
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
				char g = 'y';
				while (g == 'y') {

					System.out.println("Enter Client id to be Deleted");

					String clid = sc.next();

					if (Validation.isNumber(clid)) {
						int clid1 = Integer.parseInt(clid);

						g = 'n';
						bean.setCliId(clid1);
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
			case 4:ClientBean bean1 = new ClientBean();
				System.out.println("Enter Client id ");
				bean1.setCliId(sc.nextInt());
				if (service.updateClient(bean.getCliId())) {
					System.out.println("Client Details Modified Succesfully");
				} else {
					System.out.println("Something went wrong!!! Try Again");
				}
				break;
			case 5:
				System.out.println("Enter Client id to search Client Details");
				int id1 = sc.nextInt();
				@SuppressWarnings("unused")
				 ClientBean clientbean = service.searchClient(id1);
				if (bean != null) {
					System.out.println("ID:" + bean.getCliId());
					System.out.println("Telephone:" + bean.getTelNo());
					System.out.println("Client Name:" + bean.getCliName());
					System.out.println("Town:" + bean.getTown());
					System.out.println("Postal Code:" + bean.getPostCode());
					System.out.println("Email:" + bean.getEmail());
					

				} else {
					System.err.println("Client Not Found");
				}
				break;

			case 6:
				FMSHome.home();
				break;
			default:
				break;
			}
		}

	}
}
