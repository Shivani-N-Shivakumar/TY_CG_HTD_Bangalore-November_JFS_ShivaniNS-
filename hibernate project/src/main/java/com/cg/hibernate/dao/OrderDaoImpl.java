package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.hibernate.dto.ClientBean;
import com.cg.hibernate.dto.OrderBean;

public class OrderDaoImpl implements OrderDao{

	@Override
	public boolean addOrder(OrderBean bean) {
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
	public boolean deleteOrder(int orderno) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			OrderBean record = entityManager.find(OrderBean.class, orderno);
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
	public List<OrderBean> getAllOrder(OrderBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from OrderBean";
			Query query = entityManager.createQuery(jpql);
			List<OrderBean> list = query.getResultList();
			return list;
			
		}catch(Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

}
