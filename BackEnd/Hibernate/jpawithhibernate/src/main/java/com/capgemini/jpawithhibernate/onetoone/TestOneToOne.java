package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeOther;
import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestOneToOne {
	public static void main(String[] args) {
		EmployeeInfo emp=new EmployeeInfo();
		emp.setEid(6);
		emp.setEname("ABCDEF");
		emp.setEmail("abcd@email.com");
		emp.setPassword("1234");
		EmployeeOther other=new EmployeeOther();
		other.setId(7);
		other.setPancard("12345");
		other.setFname("ds");
		other.setMname("sd");
		other.setEmpInfo(emp);
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
        entityManager=entityManagerFactory.createEntityManager();
        transaction=entityManager.getTransaction();
        transaction.begin();
        //entityManager.persist(other);
        
        System.out.println("record saved...");
        transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
        entityManager.close();


}
}
