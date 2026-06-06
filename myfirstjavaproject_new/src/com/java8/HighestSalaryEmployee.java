package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class HighestSalaryEmployee {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Yaswanth", 45000),
				new Employee(2, "Sai", 60000),
				new Employee(3, "Vamsi", 75000),
				new Employee(4, "Uma", 50000));

		Optional<Employee> highestSalaryEmployee = employees.stream()
				.max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

		highestSalaryEmployee.ifPresent(System.out::println);
	}
}