package com.capgemini.phonesimulator.controller;

import java.util.*;


import com.capgemini.phonesimulator.bean.ContactBean;
import com.capgemini.phonesimulator.dao.ContactDAO;
import com.capgemini.phonesimulator.factory.ContactFactory;
import com.capgemini.phonesimulator.services.ContactServices;

public class Home {

	public static void main(String[] args) {
		ContactBean bean = new ContactBean();
	    ContactDAO dao = ContactFactory.instanceOfContactDAOImpl();
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println("PHONE SIMULATOR APPLICATION");
		System.out.println("---------------------------");
		System.out.println("Press 1 to List All the Contacts");
		System.out.println("Press 2 to Search Contact");
		System.out.println("Press 3 to do some Operations");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:List<ContactBean> c1=dao.getAllContact();
	       if (c1!=null) {
		   for(ContactBean con: c1) {
			   System.out.println(con);
	       }
	       } else {
		       System.err.println("Contact Not Found");
	       }
	           break;
		case 2:System.out.println("Enter Contact Name to be Searched");
	       String name1=sc.next();
	       boolean check1=dao.searchContact(name1);
	       if (check1) {
		        System.out.println("Contact Name found");
		    
	       } else {
		        System.err.println("Contact Not Found");
	       }
	            break;
		case 3:Contact.home();
		break;
			default:break;
		}

	}

}
