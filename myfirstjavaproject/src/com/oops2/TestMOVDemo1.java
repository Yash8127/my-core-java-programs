package com.oops2;

//byte → short → char → int → long → float → double

public class TestMOVDemo1 {
	// area of circle
	void getArea(double r) {
		double a = (22.0 / 7) * r * r;
		System.out.println("Area of Circle: " + a);
	}

	// area of traingle
	void getArea(float h, double b) {
		double a = 0.5 * h * b;
		System.out.println("Area of Traingle: " + a);
	}

	// area of rectangle
	void getArea(double l, double b) {
		double a = l * b;
		System.out.println("Area of Rectangle: " + a);
	}

	// area of square
	void getArea(float s) {
		float a = s * s;
		System.out.println("Area of Square: " + a);
	}

	void main() {
		System.out.println("main method started");
		getArea(2d);
		getArea(2, 3);
		getArea(2d, 4d);
		getArea(5);
	}

}
