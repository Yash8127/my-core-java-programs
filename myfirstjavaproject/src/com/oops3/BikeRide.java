package com.oops3;

public class BikeRide extends Ride {
//	Bike → ₹8/km
	@Override
	double calculateFare() {
		return distance * 8;
	}
}
