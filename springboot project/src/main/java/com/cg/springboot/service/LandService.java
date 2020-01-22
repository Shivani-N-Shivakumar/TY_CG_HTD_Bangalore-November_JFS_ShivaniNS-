package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.dto.LandBean;

public interface LandService {
	public boolean deleteLand(int landId);

	public List<LandBean> getLand();

	public boolean addLand(LandBean bean);

	public LandBean searchLand(int landId);
}
