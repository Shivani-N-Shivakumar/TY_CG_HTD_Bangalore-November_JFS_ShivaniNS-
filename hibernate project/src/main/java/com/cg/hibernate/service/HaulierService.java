package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dto.HaulierBean;

public interface HaulierService {
	boolean addHaulier(HaulierBean bean);

	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getAllHaulier(HaulierBean bean);
}
