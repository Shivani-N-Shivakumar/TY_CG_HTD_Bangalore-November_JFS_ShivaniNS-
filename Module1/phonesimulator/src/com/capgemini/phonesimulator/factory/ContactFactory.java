package com.capgemini.phonesimulator.factory;

import com.capgemini.phonesimulator.dao.ContactDAO;
import com.capgemini.phonesimulator.dao.ContactDAOImpl;
import com.capgemini.phonesimulator.services.ContactServices;
import com.capgemini.phonesimulator.services.ContactServicesImpl;

public class ContactFactory {
private ContactFactory() {
	
}
public static ContactDAO instanceOfContactDAOImpl() {
	ContactDAO dao= new ContactDAOImpl();
	return dao;
}
public static ContactServices instanceOfContactServicesImpl() {
	ContactServices services= new ContactServicesImpl();
	return services;
}
}

