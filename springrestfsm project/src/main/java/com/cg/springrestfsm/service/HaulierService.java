package com.cg.springrestfsm.service;

import java.util.List;

import com.cg.springrestfsm.dto.HaulierBean;

public interface HaulierService {
	public boolean deleteHaulier(int haulierId);

	public boolean addHaulier(HaulierBean bean);

	public boolean modifyHaulier(int haulierId, HaulierBean bean);

	public HaulierBean searchHaulier(int haulierId);

	public List<HaulierBean> getHaulier();
}
