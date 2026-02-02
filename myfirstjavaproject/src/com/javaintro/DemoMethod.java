package com.javaintro;

public class DemoMethod {
	int a,b;
	String result; 
 void addition(int a,int b) {
	  int result= a+b;
	  System.out.println("value after addition is " + result);
 }
 void sub(int a,int b) {
	 int result= a-b;
	 System.out.println("value after sub is " + result);
 }
 void mul(int a, int b) {
	 int result = a*b;
	 System.out.println("value after mul is " + result);
 }
	 void main() {
		System.out.println("main method started");
		DemoMethod t= new DemoMethod();
		t.addition(15, 15);
		t.sub(15, 15);
		t.mul(15, 15);
	}

}
