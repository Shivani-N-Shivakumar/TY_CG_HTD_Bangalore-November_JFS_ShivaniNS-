package com.cg.forestmanagementsystem.services;

import java.util.List;

import com.cg.forestmanagementsystem.bean.ClientBean;

public interface ClientService {
	public boolean addClient(ClientBean bean);

	public boolean deleteClient(int cliId);

	public List<ClientBean> getAllClient(ClientBean bean);

	public boolean updateClient(int cliId);

	public ClientBean searchClient(int cliId);
}
