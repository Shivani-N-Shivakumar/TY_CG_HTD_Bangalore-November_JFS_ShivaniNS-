package com.cg.forestmanagementsystem.dao;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ContractBean;

public interface ContractDAO {

	public boolean deleteContract(int ContractNo);

	public List<ContractBean> getAllContract(ContractBean bean);

	public boolean addContract(ContractBean bean);
}
