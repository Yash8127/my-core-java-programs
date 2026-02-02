package com.DailyTask;

public class HomeLoan {
	String borrowerName;
	double loanAmount;
	int years;
	double totalrepay;
	static {
		System.out.println("Home Loan Department Activated");
		}
	double calculateRepayment() {
		totalrepay = loanAmount+(0.08 * loanAmount * years);
		return totalrepay;
	}
	void showdetails() {
		System.out.println("Name Of The Person = "+borrowerName);
		System.out.println("Loan Amount = ₹"+loanAmount);
		System.out.println("Number Of Years To Repay The Total Amount = "+years);
		System.out.println("Total Repay Amount = ₹"+totalrepay);
	}
	public static void main(String[] args) {
		HomeLoan obj1 = new HomeLoan ();
		System.out.println("*****************DETAILS OF FIRST PERSON****************");
		obj1.borrowerName = "sandeep";
		obj1.loanAmount = 50000;
		obj1.years = 2;
		obj1.calculateRepayment();
		obj1.showdetails();
		HomeLoan obj2 = new HomeLoan ();
		System.out.println("*****************DETAILS OF SECOND PERSON****************");
		obj2.borrowerName = "sai";
		obj2.loanAmount = 70000;
		obj2.years = 3;
		obj2.calculateRepayment();
		obj2.showdetails();
		
		

	}

}
