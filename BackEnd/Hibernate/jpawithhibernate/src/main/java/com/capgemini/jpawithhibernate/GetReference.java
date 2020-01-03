package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//Movie record=entityManager.find(Movie.class,10000);
		Movie record=entityManager.getReference(Movie.class, 102);
		System.out.println(record.getClass());
		
		System.out.println("Id is-----"+record.getMovieid());
		System.out.println("Name is-----"+record.getMoviename());
		System.out.println("Rating is-------"+record.getRating());
		entityManager.close();

	}

}
