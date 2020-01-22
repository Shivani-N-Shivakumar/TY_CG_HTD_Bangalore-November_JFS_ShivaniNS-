package com.cg.jdbc.service;

import java.util.List;

import com.cg.jdbc.bean.ClientBean;
import com.cg.jdbc.dao.ClientDao;
import com.cg.jdbc.factory.ClientFactory;

public class ClientServiceImpl implements ClientService {
	ClientDao dao = ClientFactory.instanceOfClientDaoImpl();

	@Override
	public boolean addClient(ClientBean bean) {

		return dao.addClient(bean);
	}

	@Override
	public boolean modifyClient(ClientBean bean) {

		return dao.modifyClient(bean);
	}

	@Override
	public boolean deleteClient(int custId) {

		return dao.deleteClient(custId);
	}

	@Override
	public List<ClientBean> getAllClient(ClientBean bean) {

		return dao.getAllClient(bean);
	}

	@Override
	public ClientBean getClientDetails(int custId) {
		
		return dao.getClientDetails(custId);
	}




}
