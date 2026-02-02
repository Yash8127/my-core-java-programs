package com.oops3;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Bow Bow");
	}

	@Override
	public void eat() {
		System.out.println("Dog eats non veg only");
	}

	void walk() {
		System.out.println("dog can walks slowly but rans fast ");
	}
}
