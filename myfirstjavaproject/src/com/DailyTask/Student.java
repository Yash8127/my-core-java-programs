package com.DailyTask;

public class Student {
	String name;
	int rollNo;
	int marks;

	Student(String name, int rollNo, int marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	Student(Student s,int marks) {
		name=s.name;
		rollNo=s.rollNo;
		this.marks=marks;

	}
	void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(marks);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Yaswanth", 07, 98);
		s1.display();
		Student s2 = new Student(s1,95);
		s2.display();
	}

}
