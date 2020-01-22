package com.cg.jdbc.dao;

import java.util.List;

import com.cg.jdbc.bean.ContractBean;
import com.cg.jdbc.bean.HaulierBean;

public interface HaulierDao {
	boolean addHaulier(HaulierBean bean);

	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getAllHaulier(HaulierBean bean);
	
	public boolean modifyHaulier(HaulierBean bean);

	public HaulierBean getHaulierDetails(int haulid);
}
