package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dao.ContractDao;
import com.cg.hibernate.dto.ContractBean;
import com.cg.hibernate.factory.ContractFactory;

public class ContractServiceImpl implements ContractService {
 ContractDao dao= ContractFactory.instanceOfContractDaoImpl();
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

}
