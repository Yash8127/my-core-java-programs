package com.oops2;

public class Library_App {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("-----------------------------------");
		Student_Member s1 = new Student_Member("Women who inspired the Nation", 6);
		System.out.println("Book Name: " + s1.getBookName());
		System.out.println("Book price:₹" + s1.calculateFee());
		System.out.println("**************************************");
		Premium_Member p1 = new Premium_Member("Wings of fire", 5);
		System.out.println("Book Name: " + p1.getBookName());
		System.out.println("Book price:₹" + p1.calculateFee());

	}

}
