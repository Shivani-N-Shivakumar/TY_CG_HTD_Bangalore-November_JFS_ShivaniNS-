package com.cg.springrestfsm.service;

import java.util.List;

import com.cg.springrestfsm.dto.ContractBean;

public interface ContractService {
	public boolean deleteContract(int contractNo);

	public List<ContractBean> getContract();

	public boolean addContract(ContractBean bean);

	public boolean modifyContract(int contractNo, ContractBean bean);

	public ContractBean searchContract(int contractNo);
}
