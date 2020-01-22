package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.HaulierBean;

import com.cg.jdbc.dao.HaulierDao;

import com.cg.jdbc.factory.HaulierFactory;

public class HaulierServiceImpl implements HaulierService {
	HaulierDao dao = HaulierFactory.instanceOfHaulierDaoImpl();

	@Override
	public boolean addHaulier(HaulierBean bean) {

		return dao.addHaulier(bean);
	}

	@Override
	public boolean deleteHaulier(int haulid) {

		return dao.deleteHaulier(haulid);
	}

	@Override
	public List<HaulierBean> getAllHaulier(HaulierBean bean) {

		return dao.getAllHaulier(bean);
	}

	@Override
	public boolean modifyHaulier(HaulierBean bean) {
		
		return dao.modifyHaulier(bean);
	}

	@Override
	public HaulierBean getHaulierDetails(int haulid) {
		
		return dao.getHaulierDetails(haulid);
	}

}
