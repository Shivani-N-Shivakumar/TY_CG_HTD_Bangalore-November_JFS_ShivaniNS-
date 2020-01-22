package com.cg.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.springboot.dto.SchedulerBean;

@Repository
public class SchedulerDaoImpl implements SchedulerDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean deleteScheduler(int scheduleid) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		SchedulerBean bean = manager.find(SchedulerBean.class, scheduleid);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<SchedulerBean> getScheduler() {
		String jpql = "from SchedulerBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<SchedulerBean> query = manager.createQuery(jpql, SchedulerBean.class);

		return query.getResultList();
	}

	@Override
	public boolean addScheduler(SchedulerBean bean) {
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
	public boolean modifyScheduler(int scheduleid, SchedulerBean bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			SchedulerBean schedule = entityManager.find(SchedulerBean.class, scheduleid);
			schedule.setScheduleId(bean.getScheduleId());
			schedule.setContractId(bean.getContractId());
			schedule.setProductId(bean.getProductId());
			schedule.setQuantity(bean.getQuantity());
			schedule.setDelivaryDate(bean.getDelivaryDate());

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
		return false;
	}

	@Override
	public SchedulerBean searchScheduler(int scheduleid) {
		EntityManager manager = factory.createEntityManager();
		SchedulerBean searchscheduler = manager.find(SchedulerBean.class, scheduleid);
		return searchscheduler;
	}

}
