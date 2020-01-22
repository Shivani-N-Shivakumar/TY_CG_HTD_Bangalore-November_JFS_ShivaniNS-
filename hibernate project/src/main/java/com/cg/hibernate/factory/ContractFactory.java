package com.cg.hibernate.factory;

import com.cg.hibernate.dao.ContractDao;
import com.cg.hibernate.dao.ContractDaoImpl;
import com.cg.hibernate.service.ContractService;
import com.cg.hibernate.service.ContractServiceImpl;

public class ContractFactory {
	private ContractFactory() {

	}

	public static ContractDao instanceOfContractDaoImpl() {
		ContractDao dao = new ContractDaoImpl();
		return dao;
	}

	public static ContractService instanceOfContractServiceImpl() {
		ContractService service = new ContractServiceImpl();
		return service;
	}
}
