package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.ContractBean;
import com.cg.jdbc.dao.ContractDao;
import com.cg.jdbc.factory.ContractFactory;

public class ContractServiceImpl implements ContractService {
	ContractDao dao = ContractFactory.instanceOfContractDaoImpl();

	@Override
	public boolean addContract(ContractBean bean) {

		return dao.addContract(bean);
	}

	@Override
	public boolean deleteContract(int ContractNo) {

		return dao.deleteContract(ContractNo);
	}

	@Override
	public List<ContractBean> getAllContract(ContractBean bean) {

		return dao.getAllContract(bean);
	}

	@Override
	public boolean modifyContract(ContractBean bean) {

		return dao.modifyContract(bean);
	}

	@Override
	public ContractBean getContractDetails(int contractNO) {
		return dao.getContractDetails(contractNO);
	}

}
