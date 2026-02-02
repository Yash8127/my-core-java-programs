package com.oops1;

public class Patient {

	public static void main(String[] args) {
		Hospital p = new Hospital();
		p.setPatientId(101);
		p.setPatientName("Sai");
		p.setDaysAdimitted(11);
		p.setDailyCharges(4000);
		p.setMedicineCharges(2000);
		p.displayBill();
	}

}
