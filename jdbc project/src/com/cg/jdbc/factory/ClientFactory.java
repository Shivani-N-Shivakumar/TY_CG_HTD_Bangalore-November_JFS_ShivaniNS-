package com.cg.jdbc.factory;

import com.cg.jdbc.dao.ClientDao;
import com.cg.jdbc.dao.ClientDaoImpl;
import com.cg.jdbc.service.ClientService;
import com.cg.jdbc.service.ClientServiceImpl;

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
