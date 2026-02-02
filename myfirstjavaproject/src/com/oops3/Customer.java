package com.oops3;

public class Customer {
	private String customername;
	private String pickupCity;

	public Customer(String cname, String pickupCity) {
		this.customername = cname;
		this.pickupCity = pickupCity;
	}

	public String getCustomerName() {
		return customername;
	}

	public String getPickupCity() {
		return pickupCity;
	}

}
