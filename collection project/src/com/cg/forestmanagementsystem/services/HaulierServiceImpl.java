package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.HaulierBean;
import com.cg.forestmanagementsystem.dao.HaulierDao;
import com.cg.forestmanagementsystem.util.HaulierFactory;

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
