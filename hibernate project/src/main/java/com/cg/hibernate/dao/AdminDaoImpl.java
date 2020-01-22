package com.cg.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.hibernate.dto.Admin;

public class AdminDaoImpl implements AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
	Admin bean = new Admin();

	@Override
	public boolean adminLogin(String adminName, String adminPassword) {
		EntityManager entitymanager = entityManagerFactory.createEntityManager();

		String jpql = "from Admin where adminName=:adminName and adminPassword=:adminPassword";
		Query query = entitymanager.createQuery(jpql);
		query.setParameter("adminName", adminName);
		query.setParameter("adminPassword", adminPassword);
	
		
		try {
			
			List<Admin> list = query.getResultList();
			if (list != null && list.size() > 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		entitymanager.close();
		return false;
	}

}
