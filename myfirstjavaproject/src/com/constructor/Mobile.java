package com.constructor;

public class Mobile {
	String brand;
	String colour;
	int price;

	Mobile() {
		System.out.println("No arg constructor called");
		brand = "Unknown";
		colour = "Unknown";
		price = 0;
	}

	Mobile(String brand, int price) {
		System.out.println("two arg constructor called!");
		this.brand = brand;
		this.price = price;
	}

	Mobile(String brand, int price, String colour) {
		System.out.println("three arg constructor called!");
		this(brand, price);
		this.colour = colour;
	}

	void display() {
		System.out.println("brand: " + brand);
		System.out.println("colour: " + colour);
		System.out.println("price: " + price);
		System.out.println("*************************");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Mobile obj1 = new Mobile();
		obj1.display();
		Mobile obj2 = new Mobile("Vivo", 20000, "Black");
		obj2.display();
		Mobile obj3 = new Mobile("Realme", 25000, "purple");
		obj3.display();

	}

}
