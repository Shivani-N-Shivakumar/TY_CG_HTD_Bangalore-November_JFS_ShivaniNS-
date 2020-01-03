package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
         EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
String jpql="delete from Movie where movieid=103";
Query query=entityManager.createQuery(jpql);
query.executeUpdate();
System.out.println("record Deleted ");
transaction.commit();
entityManager.close();
	}

	}


