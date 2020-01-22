package com.cg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.dao.ContractDao;
import com.cg.springboot.dto.ContractBean;

@Service
public class ContractServiceImpl implements ContractService{
	@Autowired
	private ContractDao dao;

	@Override
	public boolean deleteContract(int contractNO) {
		
		return dao.deleteContract(contractNO);
	}

	@Override
	public List<ContractBean> getContract() {
	
		return dao.getContract();
	}

	@Override
	public boolean addContract(ContractBean bean) {
		
		return dao.addContract(bean);
	}

	@Override
	public boolean modifyContract(int contractNO, ContractBean bean) {
		
		return dao.modifyContract(contractNO, bean);
	}

	@Override
	public ContractBean searchContract(int contractNO) {
		
		return dao.searchContract(contractNO);
	}

}
