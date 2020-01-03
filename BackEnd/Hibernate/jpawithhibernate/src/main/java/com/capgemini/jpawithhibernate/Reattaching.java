package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattaching {

	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	        entityManager=entityManagerFactory.createEntityManager();
	        transaction=entityManager.getTransaction();
	        transaction.begin();
	        Movie record=entityManager.find(Movie.class, 102);
	        System.out.println(entityManager.contains(record));
	        entityManager.detach(record);
	        System.out.println(entityManager.contains(record));
	       // record.setMoviename("dear");
	        //record.setRating("ex");
	        Movie reattach=entityManager.merge(record);
	        reattach.setMoviename("HappyDays");
	        System.out.println("Record Updated.....");
	        transaction.commit();
		
		
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();


	}

}
