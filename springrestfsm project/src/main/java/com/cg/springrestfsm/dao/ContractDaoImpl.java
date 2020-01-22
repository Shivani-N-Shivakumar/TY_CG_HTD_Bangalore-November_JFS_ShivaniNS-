package com.cg.springrestfsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springrestfsm.dto.ContractBean;

@Repository
public class ContractDaoImpl implements ContractDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteContract(int contractNo) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ContractBean bean = manager.find(ContractBean.class, contractNo);
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
	public boolean modifyContract(int contractNo, ContractBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ContractBean contract = entityManager.find(ContractBean.class, contractNo);
			contract.setContractNo(bean.getContractNo());
			contract.setClientId(bean.getClientId());
			contract.setHaulierId(bean.getHaulierId());
			contract.setProductId(bean.getProductId());
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
	public ContractBean searchContract(int contractNo) {
		EntityManager manager = factory.createEntityManager();
		ContractBean searchcontract = manager.find(ContractBean.class, contractNo);
		return searchcontract;
	}

}
