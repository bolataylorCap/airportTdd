package com.capgemini.tddjunit5.airport;

public class BusinessFlight extends Flight {
	
	public BusinessFlight(String id) {
		super(id);
	}

	@Override
	public boolean addPassenger(Passenger passenger) {
		if (passenger.isVip()) {
			return passengersSet.add(passenger);
		}
		return false;
	}

	@Override
	public boolean removePassenger(Passenger passenger) {
		return false;
	}

}
