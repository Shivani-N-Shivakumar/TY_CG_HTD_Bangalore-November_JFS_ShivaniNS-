package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.dto.ContractBean;

public interface ContractService {
	public boolean deleteContract(int contractNO);

	public List<ContractBean> getContract();

	public boolean addContract(ContractBean bean);

	public boolean modifyContract(int contractNO, ContractBean bean);

	public ContractBean searchContract(int contractNO);
}
