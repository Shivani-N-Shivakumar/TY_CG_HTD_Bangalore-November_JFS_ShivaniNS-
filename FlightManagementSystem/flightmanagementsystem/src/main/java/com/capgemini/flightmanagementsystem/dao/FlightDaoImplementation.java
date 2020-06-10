package com.capgemini.flightmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.flightmanagementsystem.dto.Flight;

@Repository
public class FlightDaoImplementation implements FlightDao {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean addFlight(Flight bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {

			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(bean);
			transaction.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		return false;
		
	}

	@Override
	public boolean deleteFlight(int flightNo) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Flight bean = manager.find(Flight.class, flightNo);
		if (bean != null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<Flight> getAllFlights() {
		String jpql = "from Flight";
		EntityManager manager = entityManagerFactory.createEntityManager();
		TypedQuery<Flight> query = manager.createQuery(jpql, Flight.class);
		return query.getResultList();
	}

	@Override
	public boolean modifyFlight(Flight bean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		Flight flight = entityManager.find(Flight.class, bean.getFlightNo());
		if(flight != null) {
			flight.setFlightNo(bean.getFlightNo());
			flight.setCarrierName(bean.getCarrierName());
		    flight.setFlightModel(bean.getFlightModel());
		    flight.setSeatCapacity(bean.getSeatCapacity());
		  
            transaction.commit();
            entityManager.close();
			return true;
	}
		return false;

	}

	@Override
	public Flight searchFlight(int flightNo) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		Flight flight = manager.find(Flight.class, flightNo);
		return flight;
	}

}
