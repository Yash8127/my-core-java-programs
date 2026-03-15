package com.collections;

public class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

}
