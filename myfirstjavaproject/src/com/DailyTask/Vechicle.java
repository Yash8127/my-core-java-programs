package com.DailyTask;

public class Vechicle {
	String type;
	String brand;
	int batterCapacity;

	
	Vechicle(String type) {
		System.out.println("one arg constructor from vechicle class");
		this.type = type;
	}
}

	class Car extends Vechicle {

		Car(String type, String brand) {
			System.out.println("two arg constructor from car");
			super(type);
			this.brand = brand;
		}
	}

	class ElectricCar extends Car {

		ElectricCar(String type, String brand, int batterCapacity) {
			System.out.println("three arg from ElectricCar");
			super(type, brand);
			this.batterCapacity = batterCapacity;
			}
		void display() {
			System.out.println();
			System.out.println("CAR TYPE: "+type);
			System.out.println("CAR BRAND: "+brand);
			System.out.println("BATTER CAPACITY(KWh): "+batterCapacity);
			
		}

	public static void main(String[] args) {
		ElectricCar obj1 = new ElectricCar("sports car", "Porsche Taycan", 93);
		obj1.display();

	}

}
