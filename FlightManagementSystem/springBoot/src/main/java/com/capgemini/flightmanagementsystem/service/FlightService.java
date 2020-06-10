package com.capgemini.flightmanagementsystem.service;

import java.util.List;

import com.capgemini.flightmanagementsystem.dto.Flight;

public interface FlightService {
	
	public boolean addFlight(Flight bean);

	public boolean deleteFlight(int flightNo);

	public List<Flight> getAllFlights();
	
	 public boolean modifyFlight(Flight bean);
	    
	    public Flight searchFlight(int flightNo);
}
