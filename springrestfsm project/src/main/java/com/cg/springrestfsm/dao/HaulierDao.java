 package com.cg.springrestfsm.dao;

import java.util.List;

import com.cg.springrestfsm.dto.HaulierBean;

public interface HaulierDao {
	public boolean deleteHaulier(int haulierId);

	public List<HaulierBean> getHaulier();

	public boolean addHaulier(HaulierBean bean);

	public boolean modifyHaulier(int haulierId, HaulierBean bean);

	public HaulierBean searchHaulier(int haulierId);
}
