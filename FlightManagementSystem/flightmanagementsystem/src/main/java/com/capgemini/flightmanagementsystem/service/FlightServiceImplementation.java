package com.capgemini.flightmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flightmanagementsystem.dao.FlightDao;
import com.capgemini.flightmanagementsystem.dto.Flight;

@Service
public class FlightServiceImplementation implements FlightService{

	@Autowired
	FlightDao dao;
	
	@Override
	public boolean addFlight(Flight bean) {
		
		return dao.addFlight(bean);
	}

	@Override
	public boolean deleteFlight(int flightNo) {
	
		return dao.deleteFlight(flightNo);
	}

	@Override
	public List<Flight> getAllFlights() {
		
		return dao.getAllFlights();
	}

	@Override
	public boolean modifyFlight(Flight bean) {
		
		return dao.modifyFlight(bean);
	}

	@Override
	public Flight searchFlight(int flightNo) {
		
		return dao.searchFlight(flightNo);
	}

}
