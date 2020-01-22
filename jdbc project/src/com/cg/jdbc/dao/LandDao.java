package com.cg.jdbc.dao;

import java.util.List;

import com.cg.jdbc.bean.LandBean;

public interface LandDao {
	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landId);

	public List<LandBean> getAllLand(LandBean bean);
	
	public boolean modifyLand(LandBean bean);

	public LandBean getLandDetails(int landId);
}
