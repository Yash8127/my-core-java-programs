package com.oops3;

public abstract class Ride {
	Customer customer;
	Driver driver;
	double distance;
	String status;

	abstract double calculateFare();

	public void showRide() {
		System.out.println("Customer Name : " + customer.getCustomerName());
		System.out.println("Driver Name   : " + driver.getName());
		System.out.println("Distance      : " + distance + " km");
		System.out.println("Fare          : ₹" + calculateFare());
		System.out.println("Ride Status   : " + status);
	}
}
