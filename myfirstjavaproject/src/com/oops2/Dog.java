package com.oops2;

public class Dog extends Animal {

	 int bark() {
		return 10;
//		System.out.println("bark bark bark");
	}
	 void hello() {
		System.out.println("hi"); 
	 }

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.bark());
		d.hello();
	}

}
