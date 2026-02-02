package com.logicalstatements;

public class ElectricityBill {
	String customerName;
	static int units;
	static double billAmount;

	ElectricityBill(String customerName) {
		units = 0;
		System.out.println("Units = " + units);
		System.out.println("No consumption recorded");
	}

	ElectricityBill(String customerName, int units) {
		this.customerName = customerName;
		ElectricityBill.units = units;
		if (units > 0 && units <= 100)
			billAmount = units * 1.5;
		else if (units >= 101 && units <= 300)
			billAmount = units * 2.5;
		else if (units >= 301 && units <= 500)
			billAmount = units * 4;
		else
			billAmount = units * 6;
		System.out.println("bill amount :" + billAmount);
		display();

	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		ElectricityBill cus = new ElectricityBill("yaswanth", 1000);
	}

	void display() {
		double totalBill = 0;
		if (billAmount > 2000)

			totalBill = billAmount + (billAmount * 0.1);

		System.out.println("Customer Name : " + customerName);
		System.out.println("units consumed : " + units);
		System.out.println("TotalBill after add surcharge:" + totalBill);

	}

}
