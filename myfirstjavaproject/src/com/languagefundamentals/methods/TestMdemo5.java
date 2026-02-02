package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMdemo5 {
	public static void main(String[] args) {
		System.out.println("main method started !");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID ");
		int studentId = sc.nextInt();
		System.out.println("Enter your First name: ");
		sc.nextLine();
		String fname = sc.nextLine();
		System.out.println("Enter your Last name: ");
		String lname = sc.next();
		System.out.println("Enter Your Gender Info ");
		char c = sc.next().charAt(0);// Male
		System.out.println("Enter your phone number: ");
		long ph = sc.nextLong();
		System.out.println("Enter your weight: ");
		float we = sc.nextFloat();
		System.out.println("Enter your height: ");
		double he = sc.nextDouble();
		System.out.println("Is get you married");
		boolean a = sc.nextBoolean();
		// Creating an Object
		TestMdemo5 t6 = new TestMdemo5();
		// Calling the methods by values with reference variable0
		t6.getStudentIdInfo(studentId,fname,lname,c,ph,we,he,a);	
		sc.close();
	}

	void getStudentIdInfo(int id,String firstName, String lastName,char c,long ph,float we,double he,boolean a) {
		System.out.println("Welcome to Vcube and your ID is : " + id);
		System.out.println("Your Full Name is : " + lastName + " " + firstName);
		System.out.println("Gender is  :" + c);
		System.out.println("Your phone number is: " +ph);   
		System.out.println("your weight is: "+we);
		System.out.println("your heigt is: "+he);
		System.out.println("Marriage status: "+a);

	}
}
