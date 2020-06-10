package com.capgemini.flightmanagementsystem.dto;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "flight")
public class Flight {

	@Id
	private BigInteger flightNo;
	private String carrierName;
	private String flightModel;
	private int seatCapacity;

}
