package com.cg.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestmanagementsystem.bean.ContractBean;

public class ContractDAOImpl implements ContractDAO {

	private List<ContractBean> contractbean = new ArrayList<ContractBean>();

	@Override
	public boolean addContract(ContractBean bean) {
		for (ContractBean c : contractbean) {

			if (c.getContractNO() == bean.getContractNO()) {

				return false;
			}
		}
		contractbean.add(bean);
		return true;
	}

	@Override
	public boolean deleteContract(int ContractNo) {
		
		for (ContractBean c2 : contractbean) {
			ContractBean bean = null;
			if (c2.getContractNO() == ContractNo) {
				bean = c2;
			}

			if (bean != null) {
				contractbean.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<ContractBean> getAllContract(ContractBean bean) {

		return contractbean;
	}

}
