package com.constructor;

public class Company {

	int productId;
	String productName;
	double productPrice;

	Company() {
		productId = 0;
		productName = "unknown";
		productPrice = 0.0;
	}
	Company(double productPrice){
		this.productPrice=productPrice;
	}

	Company(int productId, String productName) {
		this.productId = productId;
		this.productName = productName;
		this(100.0);
	}

	void display() {
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + productName);
		System.out.println("Product price: " + productPrice);
	}

	public static void main(String[] args) {
		System.out.println("main metthod started");
		Company p1 = new Company();
		p1.display();
		Company p2 = new Company(101, "Soap");
		p2.display();
	}

}
