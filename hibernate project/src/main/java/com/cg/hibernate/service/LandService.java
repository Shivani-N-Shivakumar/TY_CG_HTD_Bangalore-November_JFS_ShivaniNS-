package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dto.LandBean;

public interface LandService {
	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landId);

	public List<LandBean> getAllLand(LandBean bean);
}
