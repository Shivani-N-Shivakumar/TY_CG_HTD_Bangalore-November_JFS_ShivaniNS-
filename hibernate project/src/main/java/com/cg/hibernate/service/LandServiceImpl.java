package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dao.LandDao;
import com.cg.hibernate.dto.LandBean;
import com.cg.hibernate.factory.LandFactory;

public class LandServiceImpl implements  LandService {
	LandDao dao = LandFactory.instanceOfLandDaoImpl();

	@Override
	public boolean addLand(LandBean bean) {
		
		return dao.addLand(bean);
	}

	@Override
	public boolean deleteLand(int landId) {
		
		return dao.deleteLand(landId);
	}

	@Override
	public List<LandBean> getAllLand(LandBean bean) {
		
		return dao.getAllLand(bean);
	}

}
