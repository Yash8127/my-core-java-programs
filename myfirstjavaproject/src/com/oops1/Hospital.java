package com.oops1;

public class Hospital {

	private int patientId;
	private String patientName;
	private int daysAdimitted;
	private double dailyCharges;
	private double medicineCharges;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getDaysAdimitted() {
		return daysAdimitted;
	}

	public void setDaysAdimitted(int daysAdimitted) {
		this.daysAdimitted = daysAdimitted;
	}

	public double getDailyCharges() {
		return dailyCharges;
	}

	public void setDailyCharges(double dailyCharges) {
		this.dailyCharges = dailyCharges;
	}

	public double getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(double medicineCharges) {
		this.medicineCharges = medicineCharges;
	}

	public double getcalculateBill() {
		return getDaysAdimitted() * (getMedicineCharges() + getDailyCharges());

	}

	public double getcalculateDiscount() {
		if (getDaysAdimitted() <= 5 && getDaysAdimitted() > 0) {
			return 0;
		} else if (getDaysAdimitted() > 5 && getDaysAdimitted() <= 10) {
			return getcalculateBill() * 0.05;
		} else
			return getcalculateBill() * 0.1;

	}

	public void displayBill() {
		System.out.println("Patient ID: " + getPatientId());
		System.out.println("patient Name: " + getPatientName());
		System.out.println("No of Days adimitted: " + getDaysAdimitted());
		System.out.println("Daily Charges: " + getDailyCharges());
		System.out.println("Medical Charges: " + getMedicineCharges());
		System.out.println("Total Bill:₹ " + getcalculateBill());
		System.out.println("Discount Amount:₹ " + getcalculateDiscount());
		System.out.println("Total Payable Amount:₹ " + (getcalculateBill() - getcalculateDiscount()));
	}

}
