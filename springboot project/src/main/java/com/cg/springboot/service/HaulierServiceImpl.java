package com.cg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.dao.HaulierDao;
import com.cg.springboot.dto.HaulierBean;

@Service
public class HaulierServiceImpl implements HaulierService {
	@Autowired
	private HaulierDao dao;

	
	public boolean deleteHaulier(int haulid) {
		
		return dao.deleteHaulier(haulid);
	}

	
	public List<HaulierBean> getHaulier() {
	
		return dao.getHaulier();
	}

	
	public boolean addHaulier(HaulierBean bean) {
		
		return dao.addHaulier(bean);
	}

	
	public boolean modifyHaulier(int haulid, HaulierBean bean) {
		
		return dao.modifyHaulier(haulid, bean);
	}


	public HaulierBean searchHaulier(int haulid) {
	
		return dao.searchHaulier(haulid);
	}
	
	


}
