package com.cg.springrestfsm.service;

import java.util.List;

import com.cg.springrestfsm.dto.ClientBean;

public interface ClientService {
	public boolean deleteClient(int clientId);

	public List<ClientBean> getClient();

	public boolean addClient(ClientBean bean);

	public boolean modifyClient(int clientId, ClientBean bean);

	public ClientBean searchClient(int clientId);
}
