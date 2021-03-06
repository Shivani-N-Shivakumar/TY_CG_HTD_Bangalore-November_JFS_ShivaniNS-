package com.cg.springrestfsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.LandDao;
import com.cg.springrestfsm.dto.LandBean;

@Service
public class LandServiceImpl implements LandService {
	@Autowired
	private LandDao dao;

	@Override
	public boolean deleteLand(int landId) {

		return dao.deleteLand(landId);
	}

	@Override
	public List<LandBean> getLand() {

		return dao.getLand();
	}

	@Override
	public boolean addLand(LandBean bean) {

		return dao.addLand(bean);
	}

	@Override
	public LandBean searchLand(int landId) {

		return dao.searchLand(landId);
	}

}
