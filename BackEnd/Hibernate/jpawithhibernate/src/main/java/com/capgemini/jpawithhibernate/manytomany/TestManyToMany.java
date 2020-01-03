package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;
import com.capgemini.jpawithhibernate.manytomany.TrainingInfo;

public class TestManyToMany {

	public static void main(String[] args) {
		EmployeeInfo emp1=new EmployeeInfo();
		emp1.setEid(3);
		emp1.setEname("dinga");
		emp1.setEmail("dinga@email.com");
		emp1.setPassword("3456");
		EmployeeInfo emp2=new EmployeeInfo();
		emp2.setEid(2);
		emp2.setEname("dingi");
		emp2.setEmail("dingi@email.com");
		emp2.setPassword("9876");
		ArrayList<EmployeeInfo> aList=new ArrayList<EmployeeInfo>();
		aList.add(emp1);
		aList.add(emp2);
		TrainingInfo info=new TrainingInfo();
		info.setTid(10);
		info.setTname("full stack");
		info.setDuration("30 days");
		info.seteList(aList);
		TrainingInfo info1=new TrainingInfo();
		info1.setTid(20);
		info1.setTname("mean stack");
		info1.setDuration("30 days");
		info1.seteList(aList);
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        entityManager=entityManagerFactory.createEntityManager();
        transaction=entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(info);
        entityManager.persist(info1);
        System.out.println("record saved...");
        transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
        entityManager.close();

	}

}
