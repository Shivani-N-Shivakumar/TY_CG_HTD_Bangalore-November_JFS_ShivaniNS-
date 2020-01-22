package com.cg.hibernate.dao;

import java.util.List;

import com.cg.hibernate.dto.LandBean;



public interface LandDao {
	public boolean addLand(LandBean bean);

	public boolean deleteLand(int landId);

	public List<LandBean> getAllLand(LandBean bean);
}
