package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.hibernate.dto.ProductBean;

public class ProductDaoImpl implements ProductDao {

	@Override
	public boolean addProduct(ProductBean bean) {
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

		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public boolean deleteProduct(int Prodid) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ProductBean record = entityManager.find(ProductBean.class, Prodid);
			entityManager.remove(record);
			transaction.commit();
			return true;

		} catch (Exception e) {
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		return false;

	}

	@Override
	public List<ProductBean> getAllProduct(ProductBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from ProductBean";
			Query query = entityManager.createQuery(jpql);
			List<ProductBean> list = query.getResultList();
			return list;

		} catch (Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

}
