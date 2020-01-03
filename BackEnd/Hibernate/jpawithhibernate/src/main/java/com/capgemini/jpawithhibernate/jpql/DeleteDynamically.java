package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamically {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
         EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
String jpql="delete from movie where movieid=:id";
Query query=entityManager.createQuery(jpql);
query.setParameter("id",102);
int result =query.executeUpdate();
System.out.println(result);

transaction.commit();
entityManager.close();
	}

}
