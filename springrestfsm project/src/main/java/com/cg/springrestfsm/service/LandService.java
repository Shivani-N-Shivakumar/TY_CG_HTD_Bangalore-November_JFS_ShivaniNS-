package com.cg.springrestfsm.service;

import java.util.List;

import com.cg.springrestfsm.dto.LandBean;

public interface LandService {
	public boolean deleteLand(int landId);

	public List<LandBean> getLand();

	public boolean addLand(LandBean bean);

	public LandBean searchLand(int landId);
}
