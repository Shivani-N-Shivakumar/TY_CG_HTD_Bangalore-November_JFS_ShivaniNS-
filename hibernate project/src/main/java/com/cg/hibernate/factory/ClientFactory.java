package com.cg.hibernate.factory;

import com.cg.hibernate.dao.ClientDao;
import com.cg.hibernate.dao.ClientDaoImpl;
import com.cg.hibernate.service.ClientService;
import com.cg.hibernate.service.ClientServiceImpl;

public class ClientFactory {
	private ClientFactory() {

	}

	public static ClientDao instanceOfClientDaoImpl() {
		ClientDao dao = new ClientDaoImpl();
		return dao;
	}

	public static ClientService instanceOfClientserviceImpl() {
		ClientService services = new ClientServiceImpl();
		return services;
	}
}
