package com.example.demo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.UserInfo;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean Profile(UserInfo user) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public UserInfo login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user=manager.find(UserInfo.class, email);
		return user;
	}

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserInfo user=manager.find(UserInfo.class,id);
		user.setPassword(password);
		transaction.commit();
		return true;
	}
	
}
