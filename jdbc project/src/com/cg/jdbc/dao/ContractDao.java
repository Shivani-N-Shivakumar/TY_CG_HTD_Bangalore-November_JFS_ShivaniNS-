package com.cg.jdbc.dao;

import java.util.List;

import com.cg.jdbc.bean.ContractBean;

public interface ContractDao {
	boolean addContract(ContractBean bean);

	public boolean deleteContract(int ContractNo);

	public List<ContractBean> getAllContract(ContractBean bean);

	public boolean modifyContract(ContractBean bean);

	public ContractBean getContractDetails(int contractNO);

}
