package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ContractBean;

public interface ContractService {
	public boolean deleteContract(int ContractNo);

	public List<ContractBean> getAllContract(ContractBean bean);

	public boolean addContract(ContractBean bean);
}

