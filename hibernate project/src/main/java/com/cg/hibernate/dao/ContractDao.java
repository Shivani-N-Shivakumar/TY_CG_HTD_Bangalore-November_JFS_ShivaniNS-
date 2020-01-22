package com.cg.hibernate.dao;

import java.util.List;

import com.cg.hibernate.dto.ContractBean;



public interface ContractDao {
	boolean addContract(ContractBean bean);

	public boolean deleteContract(int ContractNo);

	public List<ContractBean> getAllContract(ContractBean bean);
}
