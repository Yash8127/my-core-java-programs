package com.constructor;

public class student {
	String name;
	int id;
	String branch;

//	no arg constructor
	student() {
		System.out.println("no arg constructor called!");
		name = "yaswanth";
		id = 101;
		branch = "AID";
	}
	student(String name){
		this.name = name;
	}
	student(String name ,int id){
		this.name = name;
		this.id = id;
	}
//	parameterized constructor
	student(String name,int id,String branch){
		System.out.println("parameterized constructor called!");
		this.name=name;
		this.id = id;
		this.branch=branch;
	}

	void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(branch);
	}

	public static void main(String[] args) {
		System.out.println("main method started!");
		student obj = new student();
		obj.display();
		System.out.println("*************************");
		student obj1  = new student("vamsi",102,"CSD");
		obj1.display();
		System.out.println("*************************");
		student obj2 = new student("sai",102,"CAI");
		obj2.display();
		System.out.println("***************************");
		student obj3 = new student("pydi");
		obj3.display();
	}

}
