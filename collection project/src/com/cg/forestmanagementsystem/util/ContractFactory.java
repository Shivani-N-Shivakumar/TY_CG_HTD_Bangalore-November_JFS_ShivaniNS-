package com.cg.forestmanagementsystem.util;


import com.cg.forestmanagementsystem.dao.ContractDAO;
import com.cg.forestmanagementsystem.dao.ContractDAOImpl;
import com.cg.forestmanagementsystem.services.ContractService;
import com.cg.forestmanagementsystem.services.ContractServiceImpl;

public class ContractFactory {

	


private ContractFactory() {

}

public static ContractDAO instanceOfContractDaoImpl() {
	ContractDAO dao = new ContractDAOImpl();
	return dao;
}

public static ContractService instanceOfContractserviceImpl() {
	ContractService services = new ContractServiceImpl();
	return services;
}
}