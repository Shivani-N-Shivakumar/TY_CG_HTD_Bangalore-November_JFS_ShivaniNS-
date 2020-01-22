package com.cg.springrestfsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springrestfsm.dto.HaulierBean;

@Repository
public class HaulierDaoImpl implements HaulierDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteHaulier(int haulierId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		HaulierBean bean = manager.find(HaulierBean.class, haulierId);
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
	public boolean modifyHaulier(int haulierId, HaulierBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			HaulierBean haulier = entityManager.find(HaulierBean.class, haulierId);

			haulier.setHaulierId(bean.getHaulierId());
			haulier.setTelephoneNumber(bean.getTelephoneNumber());
			haulier.setHaulierName(bean.getHaulierName());
			haulier.setStreetAddress1(bean.getStreetAddress1());
			haulier.setStreetAddress2(bean.getStreetAddress2());
			haulier.setTown(bean.getTown());
			haulier.setPostcode(bean.getPostcode());
			haulier.setEmail(bean.getEmail());

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return false;
	}

	@Override
	public HaulierBean searchHaulier(int haulierId) {
		EntityManager manager = factory.createEntityManager();
		HaulierBean searchhaulier = manager.find(HaulierBean.class, haulierId);
		return searchhaulier;
	}

}
