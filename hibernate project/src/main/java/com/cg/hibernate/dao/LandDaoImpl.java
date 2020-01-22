package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.hibernate.dto.ClientBean;
import com.cg.hibernate.dto.LandBean;

public class LandDaoImpl implements LandDao{

	@Override
	public boolean addLand(LandBean bean) {
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
	public boolean deleteLand(int landId) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			LandBean record = entityManager.find(LandBean.class, landId);
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
	public List<LandBean> getAllLand(LandBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from LandBean";
			Query query = entityManager.createQuery(jpql);
			List<LandBean> list = query.getResultList();
			return list;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

}
