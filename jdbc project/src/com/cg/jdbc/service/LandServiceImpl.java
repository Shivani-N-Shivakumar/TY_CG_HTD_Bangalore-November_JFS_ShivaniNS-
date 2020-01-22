
package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.LandBean;
import com.cg.jdbc.dao.LandDao;
import com.cg.jdbc.factory.LandFactory;

public class LandServiceImpl implements LandService {
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

	@Override
	public boolean modifyLand(LandBean bean) {
		
		return dao.modifyLand(bean);
	}

	@Override
	public LandBean getLandDetails(int landId) {
		
		return dao.getLandDetails(landId);
	}

}
