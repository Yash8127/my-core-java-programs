package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestMdemo6 {
	
	void average(int a,int b,int c,int d, int e,int f) {
		int average = (a+b+c+d+e+f)/6;
		System.out.println("Average marks: "+average);
	}
//	
	double percentage(int a,int b,int c,int d, int e,int f) {
		double percentage = (double)(a+b+c+d+e+f)/600*100;
		return percentage;
	}

	 void main() {
		 double num = 12.34567;
		 System.out.printf("%.3f", num);
        System.out.println();

		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a marks obtained in telugu: ");
		int telmar = sc.nextInt();
		System.out.println("Enter a marks obtained in Hindi: ");
		int hinmar = sc.nextInt();
		System.out.println("Enter a marks obtained in English: ");
		int engmar = sc.nextInt();
		System.out.println("Enter a marks obtained in Maths: ");
		int mathmar = sc.nextInt();
		System.out.println("Enter a marks obtained in Science: ");
		int scimar = sc.nextInt();
		System.out.println("Enter a marks obtained in Social: ");
		int socmar = sc.nextInt();
		
		average(telmar,hinmar,engmar,mathmar,scimar,socmar);
	double per =	percentage(telmar,hinmar,engmar,mathmar,scimar,socmar);
	System.out.println("Percentage :%"+per);
 sc.close();
	}
}
