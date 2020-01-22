package com.cg.forestmanagementsystem.dao;

import java.util.List;

import com.cg.forestmanagementsystem.bean.HaulierBean;;

public interface HaulierDao {
	boolean addHaulier(HaulierBean bean);

	public boolean deleteHaulier(int haulid);

	public List<HaulierBean> getAllHaulier(HaulierBean bean);
}
