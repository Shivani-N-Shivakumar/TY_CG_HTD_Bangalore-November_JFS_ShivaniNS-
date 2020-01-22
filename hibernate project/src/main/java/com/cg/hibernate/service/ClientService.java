package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dto.ClientBean;

public interface ClientService {
	public boolean addClient(ClientBean bean);

	public boolean deleteClient(int custId);

	public List<ClientBean> getAllClient(ClientBean bean);
	
	public ClientBean searchClient(int custId);

	public boolean modifyClient(int custId, long telNo);
}
