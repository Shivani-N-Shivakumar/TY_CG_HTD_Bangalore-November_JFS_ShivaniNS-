package com.cg.springboot.dao;

import java.util.List;

import com.cg.springboot.dto.LandBean;

public interface LandDao {
	public boolean deleteLand(int landId);

	public List<LandBean> getLand();

	public boolean addLand(LandBean bean);

	public LandBean searchLand(int landId);
}
