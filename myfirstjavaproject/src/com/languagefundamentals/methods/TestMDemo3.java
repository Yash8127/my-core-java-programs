package com.languagefundamentals.methods;

//No return type + with arguments 
import java.util.Scanner;

//Q) WAP to get the Student details using methods..? 
//Read all the elements from a console using Scanner,
//pass to the methods as arguments and represents the same.
//getPhone
//getHeight
//getWeight
//GetMarriageStatus
//GetGender --> M or F
public class TestMDemo3 {
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
		TestMDemo3 t6 = new TestMDemo3();
		// Calling the methods by values with reference variable
		t6.getStudentIdInfo(studentId);
		t6.getFullName(fname, lname);
		t6.getGenderInfo(c);
		t6.getphonenumber(ph);
		t6.getweight(we);
		t6.getheight(he);
		t6.getmarriagestatus(a);
		
		sc.close();
	}
	void getGenderInfo(char c) {
		System.out.println("Gender is  :" + c);
	}

	void getFullName(String firstName, String lastName) {
		System.out.println("Your Full Name is : " + lastName + " " + firstName);
	}

	void getStudentIdInfo(int id) {
		System.out.println("Welcome to Vcube and your ID is : " + id);
	}

	void getphonenumber(long ph) {
		System.out.println("Your phone number is: " +ph);     
	}
	void getweight(float we) {
		System.out.println("your weight is: "+we);
	}
	void getheight(double he) {
		System.out.println("your heigt is: "+he);
	}
	void getmarriagestatus(boolean a) {
		System.out.println("Marriage status: "+a);
	}
}
