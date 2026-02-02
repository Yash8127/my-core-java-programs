package com.DailyTask;

import java.util.Scanner;

public class ZoomCarRentals {
	
	
//	greetings to the customer
static {
	System.out.println("Welcome to the Zoom Car Rentals");
	System.out.println("*********************************");
}   
int getdailyfixedrent() {
	int dailyrent = 1500;
	return dailyrent;
}
int fixedinsurance() {
	int insurance = 500;
	return insurance;
}

int gettotalrent(int num,int rent,int insurance) {
	int totalrent = num*rent+insurance;
	return totalrent;
}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ZoomCarRentals cus = new ZoomCarRentals();
		System.out.println("Enter no of days that you want to rent the car: ");
		int num = sc.nextInt();
		int rent = cus.getdailyfixedrent();
		int insurance = cus.fixedinsurance();
		int totalrent = cus.gettotalrent(num,rent,insurance);
		System.out.println("Daily fixed rent: "+rent);
		System.out.println("Fixed insurance: "+insurance);
		System.out.println("Total Rent: " +totalrent);
		sc.close();

	}

}
