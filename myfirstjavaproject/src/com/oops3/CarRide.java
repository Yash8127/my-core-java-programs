package com.oops3;

public class CarRide extends Ride {
	// Car → ₹15/km
	@Override
	 double calculateFare() {
		return distance * 15;
	}

}
