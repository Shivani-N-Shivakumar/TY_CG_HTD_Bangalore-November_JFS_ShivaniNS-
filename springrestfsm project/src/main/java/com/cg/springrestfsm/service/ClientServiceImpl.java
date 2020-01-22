package com.cg.springrestfsm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springrestfsm.dao.ClientDao;
import com.cg.springrestfsm.dto.ClientBean;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao dao;

	@Override
	public boolean deleteClient(int clientId) {

		return dao.deleteClient(clientId);
	}

	@Override
	public List<ClientBean> getClient() {

		return dao.getClient();
	}

	@Override
	public boolean addClient(ClientBean bean) {

		return dao.addClient(bean);
	}

	@Override
	public boolean modifyClient(int clientId, ClientBean bean) {

		return dao.modifyClient(clientId, bean);
	}

	@Override
	public ClientBean searchClient(int clientId) {

		return dao.searchClient(clientId);
	}

}
