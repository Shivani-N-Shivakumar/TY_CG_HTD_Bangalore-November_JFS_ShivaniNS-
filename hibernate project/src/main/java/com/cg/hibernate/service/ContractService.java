package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dto.ContractBean;

public interface ContractService {
	boolean addContract(ContractBean bean);

	public boolean deleteContract(int ContractNo);

	public List<ContractBean> getAllContract(ContractBean bean);
}
