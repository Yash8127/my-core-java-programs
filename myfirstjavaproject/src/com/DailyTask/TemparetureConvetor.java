package com.DailyTask;

import java.util.Scanner;

public class TemparetureConvetor {

	double convertToFahrenheit(double  a) {
		double f = (a * 9 / 5) + 32;
		return f;
	}
	double convertToCelsius(double f) {
		double c = (f-32)*5/9;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TemparetureConvetor c = new TemparetureConvetor();
		System.out.println("Main method started");
		System.out.println("ENTER A TEMPARETURE IN CELISUS: ");
		double a = sc.nextDouble();
		double fahren = c.convertToFahrenheit(a);
		System.out.print("Fahrenheit tempareture is: " );
		System.out.printf("%.2f",fahren);
		System.out.println();
		System.out.println("ENTER A TEMPARETURE IN FAHRENHEIT: ");
		double f = sc.nextDouble();
		double celisus =c.convertToCelsius(f);
		System.out.print("Celisus tempearture is: ");
		System.out.printf("%.2f",celisus);
		sc.close();
	}

}
