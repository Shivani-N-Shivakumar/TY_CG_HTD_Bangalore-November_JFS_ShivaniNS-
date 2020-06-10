package com.capgemini.flightmanagementsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.flightmanagementsystem.dto.User;
import com.capgemini.flightmanagementsystem.exception.UserException;

@Repository
public class UserDaoImplementation implements UserDao{

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public User login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from User where email=:email ";
		TypedQuery<User> query = manager.createQuery(jpql, User.class);
		query.setParameter("email", email);
		try {
			User bean = query.getSingleResult();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if(encoder.matches(password, bean.getPassword())){
			return bean;
		}else {
			throw new UserException("password invalid");
		}
		}
			catch (Exception e) {
				e.printStackTrace();
				throw new UserException("Email invalid");
		}
	}

}
