package com.cg.jdbc.dao;

import com.cg.jdbc.bean.AdminBean;

public interface AdminDao {
	public boolean adminLogin(String username, String password);
}
