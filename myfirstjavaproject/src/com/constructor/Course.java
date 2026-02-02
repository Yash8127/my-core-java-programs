package com.constructor;

public class Course {
	int id;
	String courseName;
	int duration;
	
	Course(){
		System.out.println("no arg called");
	}
	
	Course(int id,String courseName,int duration){
		
		System.out.println("three arg called");
		this.id = id;
		this(courseName,duration);

	}
	Course(String courseName,int duration){
		System.out.println("two arg called");
		this.courseName=courseName;
		this(duration);
			}
	Course(int duration){
		this.duration = duration;
		System.out.println("one arg called");
	}
	
	
void display() {
	System.out.println("Student ID: " +id);
	System.out.println("Student Name: " +courseName);
	System.out.println("Course duration: " +duration);
	System.out.println("********************************");
	
}
	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("**********************");
		Course s1 = new Course(101,"java",6);
		s1.display();
		Course s2 = new Course(102,"python",6);
		s2.display();
		Course s3 = new Course(103,"devops",6);
		s3.display();
	}

}
