package com.cg.forestmanagementsystem.app;

import java.util.List;
import java.util.Scanner;

import com.cg.forestmanagementsystem.bean.HaulierBean;
import com.cg.forestmanagementsystem.dao.HaulierDao;
import com.cg.forestmanagementsystem.util.HaulierFactory;
import com.cg.forestmanagementsystem.validation.Validation;

public class Haulier {
	public static void main(String[] args) {
		 HaulierDao dao = HaulierFactory.instanceOfHaulierDaoImpl();

		Scanner sc = new Scanner(System.in);
		HaulierBean bean = new HaulierBean();
		

		while (true) {
			System.out.println("Press 1 to Insert All the Haulier data");
			System.out.println("Press 2 to Delete the Haulier data");
			System.out.println("Press 3 to Get All Haulier details");
			System.out.println("press 4 for home");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:char a = 'y';
			while (a == 'y') {
				System.out.println("Enter Haulier id");

				String haulid = sc.next();

				if (Validation.isNumber(haulid)) {
					int haulid1 = Integer.parseInt(haulid);
					a = 'n';
					bean.setHaulid(haulid1);
				} else {
					System.err.println("Enter only Numbers");
				}
			}
			

				
			char b = 'y';
			while (b == 'y') {
					System.out.println("Enter the haulier telephone number");
					String htelNo = sc.next();
					if(Validation.isValidTel(htelNo)) {
						long htelNo1 = Long.parseLong(htelNo);
						b = 'n';
						bean.setHtelno(htelNo1);
					}else {
						System.err.println("Enter Correct telephone number");
					}
			}
				
				char c = 'y';
				while( c == 'y') {
					
				

					System.out.println("Enter the Haulier Name");

					String hName = sc.next();
					if(Validation.isStringOnlyAlphabet(hName)) {
						
						c = 'n';
						bean.setHname(hName);
					}else {
						System.err.println("Enter Alphabets only");
					}
			}
			
			System.out.println("Enter Street address1");
String hsaddr1 = sc.next();
bean.setHstad1(hsaddr1);
System.out.println("Enter Street address2");
String hsaddr2 = sc.next();
bean.setHstad2(hsaddr2);
		
                    char e = 'y';
                    while(e == 'y') {
                    	
					System.out.println("Enter the Haulier Town");
					String htown = sc.next();
                    if(Validation.isStringOnlyAlphabet(htown)) {
						
						e = 'n';
						bean.setHtown(htown);
					}else {
						System.err.println("Enter Alphabets only");
					}
			}
					

				  
				    	
					System.out.println("Enter the Haulier Postal Code");
					String postcode = sc.next();
					bean.setHpostcode(postcode);
         

				    char d = 'y';
				    while(d == 'y') {
				    	

					System.out.println("Enter the Haulier Email");
					String email = sc.next();
                    if(Validation.isValid(email)) {
						
						d = 'n';
						bean.setHemail(email);
					}else {
						System.err.println("Enter correct email");
					}
			}
			

				boolean check = dao.addHaulier(bean);
				if (check) {
					System.out.println("Haulier added Successfully.....");

				} else {
					System.out.println("Haulier id is not valid");
				}
		
				break;

			case 2:
				char h = 'y';
				while (h == 'y') {

					System.out.println("Enter Haulier id to be Deleted");

					String hid1 = sc.next();

					if (Validation.isNumber(hid1)) {
						int hid = Integer.parseInt(hid1);

						h = 'n';
						bean.setHaulid(hid);
						boolean check2 = dao.deleteHaulier(hid);
						if (check2) {
							System.out.println("Haulier Deleted Successfully....");
						} else {
							System.err.println("Haulier not Found");
						}
					} else {
						System.err.println("Enter only Numbers");
					}

				}

				break;
			case 3:
			
				List<HaulierBean> c1 = dao.getAllHaulier(bean);
				System.out.println(c1);

				break;
			case 4:
				FMSHome.home();
				break;

			default:
				break;
			}
		}

}}
