package com.cg.springrestfsm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springrestfsm.dto.OrderBean;

@Repository
public class OrderDaoImpl implements OrderDao {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteOrder(int orderno) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		OrderBean bean = manager.find(OrderBean.class, orderno);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<OrderBean> getOrder() {
		String jpql = "from OrderBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<OrderBean> query = manager.createQuery(jpql, OrderBean.class);

		return query.getResultList();
	}

	@Override
	public boolean addOrder(OrderBean bean) {
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
	public boolean modifyOrder(int orderno, OrderBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			OrderBean order = entityManager.find(OrderBean.class, orderno);
			order.setOrderno(bean.getOrderno());
			order.setClientId(bean.getClientId());
			order.setHaulierId(bean.getHaulierId());
			order.setProductId(bean.getProductId());
			order.setQuantity(bean.getQuantity());
			order.setDeliverydate(bean.getDeliverydate());

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return false;
	}

	@Override
	public OrderBean searchOrder(int orderno) {
		EntityManager manager = factory.createEntityManager();
		OrderBean searchorder = manager.find(OrderBean.class, orderno);
		return searchorder;
	}
}
