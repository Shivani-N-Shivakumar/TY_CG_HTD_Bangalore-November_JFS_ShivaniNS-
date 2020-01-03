package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrive {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//String jpql="from Movie";
		String jpql="select moviename from Movie";
		Query query=entityManager.createQuery(jpql);
		List<String> record=query.getResultList();
		for(String movie:record) {
			//System.out.println("Movie Id "+movie.getMovieid());
			//System.out.println("Movie Name "+movie.getMoviename());
			//System.out.println("Movie Rating "+movie.getRating());
			System.out.println(movie);
		}
entityManager.close();
	}
	

}
