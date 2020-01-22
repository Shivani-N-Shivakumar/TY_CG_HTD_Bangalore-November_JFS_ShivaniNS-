package com.cg.forestmanagementsystem.util;

import com.cg.forestmanagementsystem.dao.ClientDao;
import com.cg.forestmanagementsystem.dao.ClientDaoImpl;

import com.cg.forestmanagementsystem.services.ClientService;
import com.cg.forestmanagementsystem.services.ClientServiceImpl;

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
