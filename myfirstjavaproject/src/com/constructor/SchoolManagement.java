package com.constructor;

public class SchoolManagement {
	int id;
	String name;
	String section;

	SchoolManagement(int id, String name, String section) {
		this.id = id;
		this.name = name;
		this.section = section;

	}

	SchoolManagement(SchoolManagement copy) {
		id = copy.id;
		name = copy.name;
		section = copy.section;

	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("NAME: " + name);
		System.out.println("SECTION: " + section);
		System.out.println("-----------------------------");

	}

	public static void main(String[] args) {
		SchoolManagement std1 = new SchoolManagement(111, "VAMSI", "A");
		// copy details
		SchoolManagement std2 = new SchoolManagement(std1);

		System.out.println("orginal student details");
		std1.display();
		System.out.println("Duplicate copy of student deatils");
		std2.display();

		// upadate section
		std1.section = "B";
		System.out.println("Student details after changing section");
		std1.display();

	}

}
