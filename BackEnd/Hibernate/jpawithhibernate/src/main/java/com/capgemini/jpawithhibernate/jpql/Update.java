package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
         EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
String jpql="update Movie set moviename='Banglore days' where movieid=103";
Query query=entityManager.createQuery(jpql);
query.executeUpdate();

transaction.commit();
entityManager.close();
	}

}
