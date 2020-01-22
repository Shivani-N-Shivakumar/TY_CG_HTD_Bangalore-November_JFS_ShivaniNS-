package com.cg.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.cg.springboot.dto.LandBean;

@Repository
public class LandDaoImpl implements LandDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteLand(int landId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		LandBean bean = manager.find(LandBean.class, landId);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<LandBean> getLand() {
		String jpql = "from LandBean ";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<LandBean> query = manager.createQuery(jpql, LandBean.class);

		return query.getResultList();

	}

	@Override
	public boolean addLand(LandBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return true;
	}

	@Override
	public LandBean searchLand(int landId) {
		EntityManager manager = factory.createEntityManager();
		LandBean searchland = manager.find(LandBean.class, landId);
		return searchland;
	}

}
