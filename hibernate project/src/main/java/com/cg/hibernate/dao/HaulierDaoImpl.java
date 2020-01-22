package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.cg.hibernate.dto.HaulierBean;

public class HaulierDaoImpl implements HaulierDao{

	@Override
	public boolean addHaulier(HaulierBean bean) {
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
			
		} catch(Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public boolean deleteHaulier(int haulid) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			HaulierBean record = entityManager.find(HaulierBean.class, haulid);
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
	public List<HaulierBean> getAllHaulier(HaulierBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from HaulierBean";
			Query query = entityManager.createQuery(jpql);
			List<HaulierBean> list = query.getResultList();
			return list;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

}
