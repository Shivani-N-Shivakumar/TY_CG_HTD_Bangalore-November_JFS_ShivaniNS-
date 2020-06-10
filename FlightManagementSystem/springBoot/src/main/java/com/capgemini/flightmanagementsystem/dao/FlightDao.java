package com.capgemini.flightmanagementsystem.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.flightmanagementsystem.dto.Flight;

@Repository
public interface FlightDao  {

	public boolean addFlight(Flight bean);

	public boolean deleteFlight(int flightNo);

	public List<Flight> getAllFlights();
	
	 public boolean modifyFlight(Flight bean);
	    
	    public Flight searchFlight(int flightNo);

}
