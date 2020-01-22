package com.cg.forestmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.forestmanagementsystem.bean.HaulierBean;
import com.cg.forestmanagementsystem.bean.ProductBean;

public class HaulierDaoImpl implements HaulierDao{
	private List<HaulierBean> haulierbean = new ArrayList<HaulierBean>();
	@Override
	public boolean addHaulier(HaulierBean bean) {
		for (HaulierBean h1 : haulierbean) {

			if (h1.getHaulid() == bean.getHaulid()) {

				return false;
			}
		}
		haulierbean.add(bean);
		return true;
	}
	

	@Override
	public boolean deleteHaulier(int haulid) {
		for (HaulierBean cb : haulierbean) {
			HaulierBean bean = null;
			if (cb.getHaulid() == haulid) {
				bean = cb;
			}
		
		if (bean != null) {
			haulierbean.remove(bean);
			return true;
		}
		}
		return false;

	}

	

	@Override
	public List<HaulierBean> getAllHaulier(HaulierBean bean) {
		return haulierbean;
	}

}
