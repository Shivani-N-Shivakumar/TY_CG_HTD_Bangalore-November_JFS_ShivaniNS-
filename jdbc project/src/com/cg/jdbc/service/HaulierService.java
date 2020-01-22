package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.HaulierBean;

public interface HaulierService {
	boolean addHaulier(HaulierBean bean);

	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getAllHaulier(HaulierBean bean);
	
	public boolean modifyHaulier(HaulierBean bean);

	public HaulierBean getHaulierDetails(int haulid);
}
