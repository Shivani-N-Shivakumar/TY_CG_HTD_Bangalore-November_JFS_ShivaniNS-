package com.cg.hibernate.dao;

import java.util.List;

import com.cg.hibernate.dto.HaulierBean;



public interface HaulierDao {
	boolean addHaulier(HaulierBean bean);

	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getAllHaulier(HaulierBean bean);
}
