package com.array;

public class EmployeeSalaries {

	static void highAndLowSalary(double[] salaries) {
		int n = salaries.length;
		double maxsal = salaries[0];
		double minsal = salaries[0];
		int maxcount = 0;
		int mincount = 0;

		for (int i = 0; i < n; i++) {
			if (maxsal < salaries[i]) {
				maxsal = salaries[i];
			} else if (minsal > salaries[i]) {
				minsal = salaries[i];
			}

		}
		for (int i = 0; i < n; i++) {
			if (maxsal == salaries[i]) {
				maxcount++;
			} else if (minsal == salaries[i]) {
				mincount++;
			}

		}
		System.out.println("The higest salary: " + maxsal);
		System.out.println("The Lowest salary: " + minsal);
		System.out.println("Number of employees with Lowest salary: " + maxcount);
		System.out.println("Number of employees with Lowest salary: " + mincount);
	}

	static double avgSal(double[] sal) {
		int sum = 0;
		int n = sal.length;
		for (int i = 0; i < n; i++) {
			sum += sal[i];
		}
		double avg = sum / n;
		return avg;

	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("***********************************");
		double[] salaries = { 15000, 15000, 32000, 22000, 24000, 32000 };

		highAndLowSalary(salaries);
		System.out.println("The average salary of employees: " + avgSal(salaries));
	}

}
