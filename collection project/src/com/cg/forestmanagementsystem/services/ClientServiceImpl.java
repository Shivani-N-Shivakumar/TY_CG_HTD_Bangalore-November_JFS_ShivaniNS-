package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ClientBean;
import com.cg.forestmanagementsystem.dao.ClientDao;
import com.cg.forestmanagementsystem.util.ClientFactory;


public class ClientServiceImpl implements ClientService{
	ClientDao dao = ClientFactory.instanceOfClientDaoImpl();

	@Override
	public boolean addClient(ClientBean bean) {
		
		return dao.addClient(bean);
	}

	@Override
	public boolean deleteClient(int cliId) {
		
		return dao.deleteClient(cliId);
	}

	@Override
	public List<ClientBean> getAllClient(ClientBean bean) {
		
		return dao.getAllClient(bean);
	}

	@Override
	public boolean updateClient(int cliId) {
		
		return dao.updateClient(cliId);
	}

	@Override
	public ClientBean searchClient(int cliId) {
		
		return dao.searchClient(cliId);
	}

}
