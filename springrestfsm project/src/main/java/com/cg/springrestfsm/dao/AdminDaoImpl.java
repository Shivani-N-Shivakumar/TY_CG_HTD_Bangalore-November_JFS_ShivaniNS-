package com.cg.springrestfsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import com.cg.springrestfsm.dto.AdminBean;
import com.cg.springrestfsm.exception.AdminException;

public class AdminDaoImpl implements AdminDao {
	
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean register(AdminBean bean) {
		
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			
		
		manager.persist(bean);
		transaction.commit();
		return true;
		}catch(Exception e) {
			e.printStackTrace();
			throw new AdminException("Admin already Exist");
		}
	}
	@Override
	public boolean changePassword(int admimId, String adminPassword) {
	
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		AdminBean bean=manager.find(AdminBean.class,admimId);
		bean.setAdminPassword(adminPassword);
		transaction.commit();
		return true;
			
	}

	

}
