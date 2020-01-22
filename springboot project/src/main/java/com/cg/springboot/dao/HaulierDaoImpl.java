package com.cg.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springboot.dto.HaulierBean;

@Repository
public class HaulierDaoImpl implements HaulierDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteHaulier(int haulid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		HaulierBean bean = manager.find(HaulierBean.class, haulid);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<HaulierBean> getHaulier() {
		String jpql = "from HaulierBean ";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<HaulierBean> query = manager.createQuery(jpql, HaulierBean.class);

		return query.getResultList();
	}

	@Override
	public boolean addHaulier(HaulierBean bean) {
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
	public boolean modifyHaulier(int haulid, HaulierBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			HaulierBean haulier = entityManager.find(HaulierBean.class, haulid);

			haulier.setHaulid(bean.getHaulid());
			haulier.setHtelno(bean.getHtelno());
			haulier.setHname(bean.getHname());
			haulier.setHstad1(bean.getHstad1());
			haulier.setHstad2(bean.getHstad2());
			haulier.setHtown(bean.getHtown());
			haulier.setHpostcode(bean.getHpostcode());
			haulier.setHemail(bean.getHemail());

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return false;
	}

	@Override
	public HaulierBean searchHaulier(int haulid) {
		EntityManager manager = factory.createEntityManager();
		HaulierBean searchhaulier = manager.find(HaulierBean.class, haulid);
		return searchhaulier;
	}

}
