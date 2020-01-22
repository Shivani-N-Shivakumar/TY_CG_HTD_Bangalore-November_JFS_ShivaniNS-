package com.cg.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.cg.springboot.dto.ContractBean;

@Repository
public class ContractDaoImpl implements ContractDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteContract(int contractNO) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ContractBean bean = manager.find(ContractBean.class, contractNO);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<ContractBean> getContract() {
		String jpql = "from ContractBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ContractBean> query = manager.createQuery(jpql, ContractBean.class);
		

		return query.getResultList();
	}

	@Override
	public boolean addContract(ContractBean bean) {
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
	public boolean modifyContract(int contractNO, ContractBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean contract = entityManager.find(ContractBean.class, contractNO);
			contract.setContractNO(bean.getContractNO());
			contract.setCustId(bean.getCustId());
			contract.setHaulId(bean.getHaulId());
			contract.setProdId(bean.getProdId());
			contract.setQuantity(bean.getQuantity());
			contract.setDeliveryDate(bean.getDeliveryDate());
			contract.setDeliveryDay(bean.getDeliveryDay());
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return false;

	}

	@Override
	public ContractBean searchContract(int contractNO) {
		EntityManager manager = factory.createEntityManager();
		ContractBean searchcontract = manager.find(ContractBean.class, contractNO);
		return searchcontract;
	}

}
