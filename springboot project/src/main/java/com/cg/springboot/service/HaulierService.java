package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.dto.HaulierBean;

public interface HaulierService {
	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getHaulier();

	public boolean addHaulier(HaulierBean bean);

	public boolean modifyHaulier(int haulid, HaulierBean bean);

	public HaulierBean searchHaulier(int haulid);
}
