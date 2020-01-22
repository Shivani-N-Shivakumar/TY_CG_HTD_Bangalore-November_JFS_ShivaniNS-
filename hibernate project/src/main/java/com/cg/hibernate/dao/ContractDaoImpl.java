package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.cg.hibernate.dto.ContractBean;

public class ContractDaoImpl implements ContractDao {

	@Override
	public boolean addContract(ContractBean bean) {
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
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public boolean deleteContract(int ContractNo) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean record = entityManager.find(ContractBean.class, ContractNo);
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
	public List<ContractBean> getAllContract(ContractBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from ContractBean";
			Query query = entityManager.createQuery(jpql);
			List<ContractBean> list = query.getResultList();
			return list;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

}
