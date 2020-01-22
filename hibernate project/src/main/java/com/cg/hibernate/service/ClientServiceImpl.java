package com.cg.hibernate.service;

import java.util.List;

import com.cg.hibernate.dao.ClientDao;
import com.cg.hibernate.dto.ClientBean;
import com.cg.hibernate.factory.ClientFactory;

public class ClientServiceImpl implements ClientService {
ClientDao dao = ClientFactory.instanceOfClientDaoImpl();
	@Override
	public boolean addClient(ClientBean bean) {
		
		return dao.addClient(bean);
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
	public ClientBean searchClient(int custId) {
		
		return dao.searchClient(custId);
	}



	@Override
	public boolean modifyClient(int custId, long telNo) {
		
		return dao.modifyClient(custId, telNo);
	}

}
