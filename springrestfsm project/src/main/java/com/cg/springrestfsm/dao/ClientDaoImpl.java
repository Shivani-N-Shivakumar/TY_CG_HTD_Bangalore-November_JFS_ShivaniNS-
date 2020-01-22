package com.cg.springrestfsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springrestfsm.dto.ClientBean;

@Repository
public class ClientDaoImpl implements ClientDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteClient(int clientId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		ClientBean bean = manager.find(ClientBean.class, clientId);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<ClientBean> getClient() {
		String jpql = "from ClientBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ClientBean> query = manager.createQuery(jpql, ClientBean.class);

		return query.getResultList();

	}

	@Override
	public boolean addClient(ClientBean bean) {

		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public boolean modifyClient(int clientId, ClientBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			ClientBean client = entityManager.find(ClientBean.class, clientId);
			client.setClientId(bean.getClientId());
			client.setTelephoneNumber(bean.getTelephoneNumber());
			client.setClientName(bean.getClientName());
			client.setStreetAddress1(bean.getStreetAddress1());
			client.setStreetAddress2(bean.getStreetAddress2());
			client.setTown(bean.getTown());
			client.setPostCode(bean.getPostCode());
			client.setEmail(bean.getEmail());
			

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return true;
		}

		entityManager.close();
		return false;

	}

	@Override
	public ClientBean searchClient(int clientId) {
		EntityManager manager = factory.createEntityManager();
		ClientBean searchclient = manager.find(ClientBean.class, clientId);
		return searchclient;

	}

}
