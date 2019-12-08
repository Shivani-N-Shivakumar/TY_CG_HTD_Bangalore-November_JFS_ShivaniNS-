package com.capgemini.jdbc.factory;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.dao.UserDAOImpl;
import com.capgemini.jdbc.services.UserServices;
import com.capgemini.jdbc.services.UserServicesImpl;

public class UserfFactory {
private UserfFactory() {
	
}
public static UserDAO instanceOfUserDAOImpl() {
	UserDAO dao= new UserDAOImpl();
	return dao;
}
public static UserServices intanceofUserservices() {
	UserServices services=new UserServicesImpl();
	return services;
}
}
