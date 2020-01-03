package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie record=entityManager.find(Movie.class, 102);
		System.out.println("Id----"+record.getMovieid());
		System.out.println("Name----"+record.getMoviename());

		System.out.println("Rating----"+record.getRating());
		entityManager.close();


	}

}
