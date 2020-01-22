package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ContractBean;
import com.cg.forestmanagementsystem.dao.ContractDAO;
import com.cg.forestmanagementsystem.util.ContractFactory;

public class ContractServiceImpl implements ContractService {
	ContractDAO dao = ContractFactory.instanceOfContractDaoImpl();

	@Override
	public boolean deleteContract(int ContractNo) {

		return dao.deleteContract(ContractNo);
	}

	@Override
	public List<ContractBean> getAllContract(ContractBean bean) {

		return dao.getAllContract(bean);
	}

	@Override
	public boolean addContract(ContractBean bean) {

		return dao.addContract(bean);
	}

}
