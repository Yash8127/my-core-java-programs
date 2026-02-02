package com.DailyTask;

public class Employee {
	
	static {
		Integer Empno;
		String Empname = "Yaswanth";
		Integer salary;
		Integer Experience = 2;
		Integer Annualsalary;
		Integer Annualbonus;
		salary = 12 * 50000;
	  Annualbonus = (int) (salary * 0.10);
	   Annualsalary = salary + Annualbonus;
		System.out.println("Employee Name " +Empname);
		System.out.println("Annual Bonus " +Annualbonus);
		System.out.println("Annual salary " +Annualsalary);
		System.out.println("Experince interms Of Years = " +Experience);
		
	}

	public static void main(String[] args) {
       
	}

}
