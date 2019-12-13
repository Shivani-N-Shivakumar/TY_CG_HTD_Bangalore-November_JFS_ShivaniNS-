package com.capgemini.phonesimulator.services;

import java.util.List;

import com.capgemini.phonesimulator.bean.ContactBean;
import com.capgemini.phonesimulator.dao.ContactDAO;
import com.capgemini.phonesimulator.factory.ContactFactory;
import com.capgemini.phonesimulator.dao.ContactDAOImpl;;

public class ContactServicesImpl implements ContactServices{
	ContactDAO dao=ContactFactory.instanceOfContactDAOImpl();

	@Override
	public List<ContactBean> getAllContact() {
		
		return dao.getAllContact();
	}

	@Override
	public boolean searchContact(String name) {
		
		return dao.searchContact(name);
	}

	@Override
	public boolean addContact(ContactBean bean) {
		
		return dao.addContact(bean);
	}

	@Override
	public boolean deleteContact(String name) {
		
		return dao.deleteContact(name);
	}

	@Override
	public boolean updateContact(String name, int number, String groupName) {
		return dao.updateContact(name, number, groupName);
	}

}
