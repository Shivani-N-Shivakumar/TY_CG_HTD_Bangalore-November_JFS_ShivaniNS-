package com.cg.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.ClientBean;
import com.cg.forestmanagementsystem.bean.CustomerBean;
import com.cg.forestmanagementsystem.validation.Validation;

public class ClientDaoImpl implements ClientDao {
	Scanner sc = new Scanner(System.in);
	private List<ClientBean> clientbean = new ArrayList<ClientBean>();

	@Override
	public boolean addClient(ClientBean bean) {
		for (ClientBean cb : clientbean) {

			if (cb.getCliId() == bean.getCliId()) {

				return false;
			}
		}
		clientbean.add(bean);
		return true;
	}

	@Override
	public boolean deleteClient(int cliId) {
		for (ClientBean cb : clientbean) {
			ClientBean bean = null;
			if (cb.getCliId() == cliId) {
				bean = cb;
			}

			if (bean != null) {
				clientbean.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ClientBean> getAllClient(ClientBean bean) {

		return clientbean;
	}

	@Override
	public boolean updateClient(int cliId) {
		for (ClientBean cb : clientbean) {
			if((cb.getCliId())== cliId) {
				System.out.println("choose the field to be modified");
				System.out.println("1: Client Name\n 2: Town\n 3: Postal code\n 4:Email\n 5:Telephone Number ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					boolean a = true;
					while (a == true) {
						System.out.println("Enter the name to be Modified");
						String name = sc.next();
						if (Validation.isStringOnlyAlphabet(name)) {

							a = false;
							cb.setCliName(name);
						} else
							System.err.println("Enter Alphabets only");

					}
					break;
				case 2:
					boolean t = true;
					while (t == true) {
						System.out.println("Enter the Town");
						String town = sc.next();
						if (Validation.isStringOnlyAlphabet(town)) {

							t = false;
							cb.setTown(town);
						} else
							System.err.println("Enter Alphabets only");
					}
					break;
				case 3:
					boolean p = true;
					while (p == true) {
						System.out.println("enter Postal Code");
						String postalCode = sc.next();
						if (Validation.isValidPostalCode(postalCode)) {
							
							p = false;
							cb.setPostCode(postalCode);
						} else
							System.err.println("Enter Correct 6 Digit PostalCode");
					}
					break;
				case 4:
					char d = 'y';
					while (d == 'y') {

						System.out.println("Enter the Client Email");
						String email = sc.next();
						if (Validation.isValid(email)) {

							d = 'n';
							cb.setEmail(email);
						} else
							System.err.println("Enter correct email");

					}
					break;
				case 5:
					char e = 'y';
					while (e == 'y') {

						System.out.println("Enter the Client Email");
						String email = sc.next();
						if (Validation.isValid(email)) {

							e = 'n';
							cb.setEmail(email);
						} else
							System.err.println("Enter correct email");

					}
					break;
				default:
					break;

				}

			}
			return true;
		}
		return false;
	}

	@Override
	public ClientBean searchClient(int cliId) {
		for (ClientBean cb : clientbean) {
			if (cb.getCliId() == cliId)
				return cb;
		}
		return null;
	}

}
