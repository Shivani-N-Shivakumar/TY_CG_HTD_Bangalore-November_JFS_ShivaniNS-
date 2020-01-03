package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.manytoone.EmployeeExperience;
import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class ManyToOne {

	public static void main(String[] args) {
		EmployeeInfo emp1=new EmployeeInfo();
		emp1.setEid(5);
		emp1.setEname("ABCD");
		emp1.setEmail("abcd@email.com");
		emp1.setPassword("1123");
		EmployeeExperience emp2=new EmployeeExperience();
		emp2.setExpid(1);
		emp2.setCname("ab");
		emp2.setYear(2);
		emp2.setEmp(emp1);
		EmployeeExperience emp3=new EmployeeExperience();
		emp3.setExpid(2);
		emp3.setCname("sd");
		emp3.setYear(2);
		emp3.setEmp(emp1);
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        entityManager=entityManagerFactory.createEntityManager();
        transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(emp2);
        entityManager.persist(emp3);
        System.out.println("record saved...");
        transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
        entityManager.close();


	}

}
