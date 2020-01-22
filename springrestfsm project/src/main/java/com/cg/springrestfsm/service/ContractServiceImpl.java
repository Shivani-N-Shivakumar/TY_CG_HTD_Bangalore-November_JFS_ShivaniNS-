package com.cg.springrestfsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.ContractDao;
import com.cg.springrestfsm.dto.ContractBean;

@Service
public class ContractServiceImpl implements ContractService {
	@Autowired
	private ContractDao dao;

	@Override
	public boolean deleteContract(int contractNo) {

		return dao.deleteContract(contractNo);
	}

	public List<ContractBean> getContract() {

		return dao.getContract();
	}

	@Override
	public boolean addContract(ContractBean bean) {

		return dao.addContract(bean);
	}

	@Override
	public boolean modifyContract(int contractNo, ContractBean bean) {

		return dao.modifyContract(contractNo, bean);
	}

	@Override
	public ContractBean searchContract(int contractNo) {

		return dao.searchContract(contractNo);
	}

}
