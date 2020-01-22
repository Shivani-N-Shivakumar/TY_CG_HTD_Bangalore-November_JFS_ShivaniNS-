package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.hibernate.dto.ClientBean;
import com.cg.hibernate.exception.ClientException;


public class ClientDaoImpl implements ClientDao{

	@Override
	public boolean addClient(ClientBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			return true;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}



	@Override
	public boolean deleteClient(int custId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ClientBean record = entityManager.find(ClientBean.class, custId);
			entityManager.remove(record);
			transaction.commit();
			return true;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		return false;
	
	}

	@Override
	public List<ClientBean> getAllClient(ClientBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from ClientBean";
			Query query = entityManager.createQuery(jpql);
			List<ClientBean> list = query.getResultList();
			return list;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}



	@Override
	public ClientBean searchClient(int custId) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("persistence-unit");
	    EntityManager entityManager=entityManagerFactory.createEntityManager();
	    ClientBean searchclient = entityManager.find(ClientBean.class, custId);
		return searchclient;
	
	
	}


	@Override
	public boolean modifyClient(int custId, long telNo) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
         try {
        	 ClientBean c = entityManager.find(ClientBean.class, custId);
        	 c.setCustId(custId);
        	 c.setTelNo(telNo);
        	 transaction.commit();
        	 return true;
        	 
         }catch(Exception e) {
        	 transaction.rollback();
         }
         entityManager.close();
         throw new ClientException("This ID is not present");
	}



	}

	


