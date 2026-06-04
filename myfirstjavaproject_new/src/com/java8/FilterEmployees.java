package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class FilterEmployees {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee(1, "Yaswanth", 45000),
				new Employee(2, "Sai", 60000),
				new Employee(3, "Vamsi", 75000),
				new Employee(4, "Uma", 40000));

		List<Employee> result = employees.stream()
				.filter(emp -> emp.getSalary() > 50000)
				.collect(Collectors.toList());

		result.forEach(System.out::println);
	}
}