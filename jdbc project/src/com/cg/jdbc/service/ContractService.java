package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.ContractBean;

public interface ContractService {
	boolean addContract(ContractBean bean);

	public boolean deleteContract(int ContractNo);

	public List<ContractBean> getAllContract(ContractBean bean);

	public boolean modifyContract(ContractBean bean);

	public ContractBean getContractDetails(int contractNO);
}
