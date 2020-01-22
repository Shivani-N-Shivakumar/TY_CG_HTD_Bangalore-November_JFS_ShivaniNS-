package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.ClientBean;

public interface ClientService {
	public boolean addClient(ClientBean bean);

	public boolean modifyClient( ClientBean bean);

	public boolean deleteClient(int custId);

	public List<ClientBean> getAllClient(ClientBean bean);
	public ClientBean getClientDetails(int custId);
}
