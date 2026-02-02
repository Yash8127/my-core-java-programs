package com.constructor;

public class Student1 {
	int id;
	String name;

	// Normal constructor
	Student1(int i, String n) {
		id = i;
		name = n;
	}

	// Copy constructor
	Student1(Student1 s) {
		id = s.id;
		name = s.name;
	}

	class bike extends Student1 {
	bike(int a, String n, bike c){
		super(c);
	}
	}

	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Yaswanth"); // normal constructor
		Student1 s2 = new Student1(s1); // copy constructor

		s1.display();
		s2.display();
	}
}
