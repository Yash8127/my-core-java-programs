package com.languagefundamentals.methods;
import java.util.Scanner;
public class TestMdemo4 {
	static Scanner sc = new Scanner(System.in);
	void main(String[] args) {
		System.out.println("main method started ");
		int add = addition();// 1400
		double sub = subtraction();// -50.0
		float div = division();
		System.out.println("Addition of two values : " + add);
		System.out.println("Subtraction of two values : " + sub);
		System.out.println("Multiplication of add & sub is : " + (add * sub));
		System.out.println("Division of two Numbers: "+div);
		System.out.println("main method ended ");
	}
	double subtraction() {
		System.out.println("Enter a number for subraction ");
		int a = sc.nextInt();
		System.out.println("Enter b number for subraction");
		int b = sc.nextInt();
		int diff = b - a;
		return diff;
	}
	int addition() {
		System.out.println("Enter a number for addition ");
		int a = sc.nextInt();
		System.out.println("Enter b number for addition ");
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}
	 float division() {
		 System.out.println("Enter a number for division ");
		 int a = sc.nextInt();
		 System.out.println("Enter a number for division ");
		 int b = sc.nextInt();
		 int div  = a/b;
		 return div;
	 }
	
}
