package com.collections;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
//		if (this.marks < o.marks)
//			return 1;
//		else if (this.marks > o.marks)
//			return -1;
//		else
//			return 0
		return this.name.compareTo(o.name);
	}

}
