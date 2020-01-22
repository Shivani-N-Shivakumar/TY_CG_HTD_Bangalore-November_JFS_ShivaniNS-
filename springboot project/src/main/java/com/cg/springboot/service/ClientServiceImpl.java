package com.cg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.dao.ClientDao;
import com.cg.springboot.dto.ClientBean;
import com.cg.springboot.exception.ClientException;
import com.cg.springboot.validation.Validation;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao dao;

	@Override
	public boolean deleteClient(int custId) {

		return dao.deleteClient(custId);
	}

	@Override
	public List<ClientBean> getClient() {

		return dao.getClient();
	}

	@Override
	public boolean addClient(ClientBean bean) {
		
		String cName = bean.getCName();
		if(Validation.isStringOnlyAlphabet(cName)) {
			bean.setCName(cName);
		}else {
			throw new ClientException("Enter only alphabets");
		}
		
		String stad1 = bean.getStad1();
		if(Validation.isStringOnlyAlphabet(stad1)) {
			bean.setStad1(stad1);
		}else {
			throw new ClientException("Enter only alphabets");
		}
		
		String stad2 = bean.getStad2();
		if(Validation.isStringOnlyAlphabet(stad2)) {
			bean.setStad2(stad2);
		}else {
			throw new ClientException("Enter only alphabets");
		}
		
		String town = bean.getStad2();
		if(Validation.isStringOnlyAlphabet(town)) {
			bean.setTown(town);
		}else {
			throw new ClientException("Enter only alphabets");
		}
		
		String email = bean.getEmail();
		if(Validation.isValid(email)) {
			bean.setEmail(email);
		}else {
			throw new ClientException("Enter correct Email");
		}
		
		String postCode = bean.getPostCode();
		if(Validation.isValidPostalCode(postCode)) {
			bean.setPostCode(postCode);
		}else {
			throw new ClientException("Enter correct 6 digits postalcode");
		} 
		


		return dao.addClient(bean);
	}

	@Override
	public boolean modifyClient(int custId, ClientBean bean) {

		return dao.modifyClient(custId, bean);
	}

	@Override
	public ClientBean searchClient(int custId) {

		return dao.searchClient(custId);
	}

}
