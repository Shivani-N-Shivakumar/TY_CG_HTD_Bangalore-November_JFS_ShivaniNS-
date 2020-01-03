package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDynamically {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
         EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
String jpql="update Movie set moviename=:mn where movieid=:id";
Query query=entityManager.createQuery(jpql);
query.setParameter("id",101);
query.setParameter("mn", "jollydays");
int result =query.executeUpdate();
System.out.println(result);

transaction.commit();
entityManager.close();

	}

}
