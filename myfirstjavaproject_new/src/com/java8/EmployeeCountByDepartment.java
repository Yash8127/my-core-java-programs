package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employe {
	private int id;
	private String name;
	private String department;

	public Employe(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}
}

public class EmployeeCountByDepartment {
	public static void main(String[] args) {

		List<Employe> employees = Arrays.asList(
				new Employe(1, "Yaswanth", "IT"),
				new Employe(2, "Sai", "HR"),
				new Employe(3, "Vamsi", "IT"),
				new Employe(4, "Uma", "HR"),
				new Employe(5, "Pooji", "Finance"));

		Map<String, Long> countByDept = employees.stream()
				.collect(Collectors.groupingBy(
						Employe::getDepartment,
						Collectors.counting()));

		System.out.println(countByDept);
	}
}