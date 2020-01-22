package com.cg.jdbc.factory;

import com.cg.jdbc.dao.ContractDao;
import com.cg.jdbc.dao.ContractDaoImpl;

import com.cg.jdbc.service.ContractService;
import com.cg.jdbc.service.ContractServiceImpl;

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

