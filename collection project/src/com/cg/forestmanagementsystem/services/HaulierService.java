package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.HaulierBean;

public interface HaulierService {
	boolean addHaulier(HaulierBean bean);

	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getAllHaulier(HaulierBean bean);
}
