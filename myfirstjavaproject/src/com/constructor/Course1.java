package com.constructor;

public class Course1 {
	int id;
	String name;
	int duration;

	public static void main(String[] args) {
		Course1 c = new Course1(1,"java",6);
		c.display();
		Course1 c1= new Course1(2,"python");
		c1.display();

	}
	Course1(){
		System.out.println("no arg called");
	}

	Course1(int id,String name,int duration) {

		this.duration=duration;
		this.id=id;
		this.name=name;
		this();

	}

	Course1(int id,String name) {
    this(id,name,10);
    }
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(duration);
	}

}
