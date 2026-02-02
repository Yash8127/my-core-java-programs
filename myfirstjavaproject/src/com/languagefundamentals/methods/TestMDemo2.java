package com.languagefundamentals.methods;

import java.util.Scanner;//Fully Qualified name of the class
// No return type + with arguments
//byte short int long float double 
//Note : java.lang is the default package in java,SO those classes you no need to import.
//But, if we are using any other classes we must need to import those classes.
public class TestMDemo2 {
	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		byte a = sc.nextByte();
		System.out.println("Enter b value : ");
		byte b = sc.nextByte();
		TestMDemo2 t = new TestMDemo2();
		// calling a method without values
		t.addition();
		// Call by value
		t.addition((byte) a,(byte) b);
		System.out.println("main method ended ");
		sc.close();
	}
	void addition() {
		System.out.println("in addition no args:");
	}
	void addition(byte a, byte b) {
		byte c = (byte) (a+b);
		System.out.println("in addition with args :" + c);
	}
}




