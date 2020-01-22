package com.cg.jdbc.dao;

import java.util.List;

import com.cg.jdbc.bean.ClientBean;

public interface ClientDao {

	public boolean addClient(ClientBean bean);

	public boolean modifyClient(ClientBean bean);

	public boolean deleteClient(int custId);

	public List<ClientBean> getAllClient(ClientBean bean);
	
	public ClientBean getClientDetails(int custId);
}
