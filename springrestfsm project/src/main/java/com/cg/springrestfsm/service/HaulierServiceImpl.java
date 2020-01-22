package com.cg.springrestfsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.HaulierDao;
import com.cg.springrestfsm.dto.HaulierBean;

@Service
public class HaulierServiceImpl implements HaulierService {
	@Autowired
	private HaulierDao dao;

	public boolean deleteHaulier(int haulierId) {

		return dao.deleteHaulier(haulierId);
	}

	public List<HaulierBean> getHaulier() {

		return dao.getHaulier();
	}

	public boolean addHaulier(HaulierBean bean) {

		return dao.addHaulier(bean);
	}

	public boolean modifyHaulier(int haulierId, HaulierBean bean) {

		return dao.modifyHaulier(haulierId, bean);
	}

	public HaulierBean searchHaulier(int haulierId) {

		return dao.searchHaulier(haulierId);
	}

}
