package com.capgemini.phonesimulator.services;
import java.util.List;

import com.capgemini.phonesimulator.bean.ContactBean;
public interface ContactServices {

	public List<ContactBean> getAllContact();
	public boolean searchContact(String name);
	public boolean addContact(ContactBean bean);
	public boolean deleteContact(String name);
	public boolean updateContact(String name,int number,String groupName);
	
}
