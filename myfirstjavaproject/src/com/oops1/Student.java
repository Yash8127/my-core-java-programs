package com.oops1;

public class Student {
	private int stuId;
	private String stuName;
	private int totalFee;
	private int paidFee;

	// Method to set student details
	public void setStudentDetails(int id, String name, int fee) {
		stuId = id;
		stuName = name;
		totalFee = fee;
		paidFee = 0;
	}

	// Method to pay fee
	public void setPayFee(double fee) {
		if (fee > 0 && fee < totalFee) {
			paidFee += fee;
			System.out.println("Fee paid successfully: ₹" + fee);
		} else if (fee > totalFee) {
			System.out.println("payment exceeds total fee");

		} else {
			System.out.println("invalid");
		}
		displayFeeStatus();
	}

	// Method to calculate remaining fee
	public double getRemainingFee() {
		return totalFee - paidFee;
	}

	// Method to display fee status
	public void displayFeeStatus() {
		System.out.println("\n----- Student Fee Status -----");
		System.out.println("Student ID   : " + stuId);
		System.out.println("Student Name : " + stuName);
		System.out.println("Total Fee    : ₹" + totalFee);
		System.out.println("Paid Fee     : ₹" + paidFee);
		System.out.println("Remaining Fee: ₹" + getRemainingFee());
	}
}
