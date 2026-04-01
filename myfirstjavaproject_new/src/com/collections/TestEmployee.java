package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("sai", 30000);
		Employee e2 = new Employee("varma", 40000);
		Employee e3 = new Employee("vamsi", 20000);
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.salary < o2.salary)
					return -1;
				else if (o1.salary > o2.salary)
					return 1;
				else
					return 0;
			}

		};
		Collections.sort(list, c);

		System.out.println(list);
	}

}
