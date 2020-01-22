package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dao.HaulierDao;
import com.cg.hibernate.dto.HaulierBean;
import com.cg.hibernate.factory.HaulierFactory;

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

}
