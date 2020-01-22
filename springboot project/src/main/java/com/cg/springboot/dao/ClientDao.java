package com.cg.springboot.dao;

import java.util.List;

import com.cg.springboot.dto.ClientBean;

public interface ClientDao {
	public boolean deleteClient(int custId);

	public List<ClientBean> getClient();

	public boolean addClient(ClientBean bean);

	public boolean modifyClient(int custId, ClientBean bean);

	public ClientBean searchClient(int custId);
}
