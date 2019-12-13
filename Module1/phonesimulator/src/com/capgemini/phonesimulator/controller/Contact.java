package com.capgemini.phonesimulator.controller;

import java.util.Scanner;

import com.capgemini.phonesimulator.bean.ContactBean;
import com.capgemini.phonesimulator.dao.ContactDAO;
import com.capgemini.phonesimulator.factory.ContactFactory;

public class Contact {

	public static void home() {
		Scanner sc = new Scanner(System.in);
	    ContactBean bean = new ContactBean();
	    ContactDAO dao = ContactFactory.  instanceOfContactDAOImpl();
	    while (true)  {
		      System.out.println("Press 1 to add Contact ");
            System.out.println("Press 2 to delete Contact");
		      System.out.println("press 3 to edit Contact");
		      System.out.println("press 4 to go back to home page");
		int choice = sc.nextInt();
		switch(choice) {
	    case 1:System.out.println("Enter Contact Name");
	       String name=sc.next();
	       System.out.println("Enter Number");
	       int num=sc.nextInt();
	       System.out.println("Enter GroupName");
	       String groupName=sc.next();
	       
	
	       bean.setName(name);
	       bean.setNumber(num);
	       bean.setGroupName(groupName);
	      
	
	       boolean check=dao.addContact(bean);
	       if (check) {
		         System.out.println("Contract added Successfully....");
	       }else {
		         System.err.println("Contract not added");
	       }
	             break;
	    case 2:System.out.println("Enter Contact Name to be Deleted");
	       String name1=sc.next();
	       boolean check1=dao.deleteContact(name1);
	       if (check1) {
		        System.out.println("Contact Deleted Successfully");
	       } else {
		        System.err.println("Contact Not Found");
	       }
	            break;
	    case 3:System.out.println("Enter Contact Name to be Modified");
	    String name2=sc.next();
	    System.out.println("enter Contact number ");
	    int id2=sc.nextInt();
	    System.out.println("enter group name");
	    String groupname2=sc.next();
	       boolean check2=dao.updateContact(name2,id2,groupname2);
	       if (check2) {
		        System.out.println("Contact Edited Successfully");
	       } else {
		        System.err.println("Contact Not Found");
	       }
	            break;
	    case 4:Home.main(null);
	    break;
	    default:break;
	}

}
}}
