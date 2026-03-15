package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Student s1 = new Student(101, "vamsi", 89);
		Student s2 = new Student(102, "yaswanth", 99);
		Student s3 = new Student(103, "sai", 77);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		System.out.println(list);
	}

}
