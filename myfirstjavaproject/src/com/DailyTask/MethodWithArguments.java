package com.DailyTask;

import java.util.Scanner;

public class MethodWithArguments {
	 static Scanner sc = new Scanner(System.in);
void add(int a, int b) {
	int c = a+b;
	System.out.println("addition value : "+c);
	System.out.println();
	System.out.println("values for subtraction");
	System.out.println("Enter a value for subtraction : ");
	int d = sc.nextInt();
	sub(c,d);	
}
void sub(int c , int d ) {
	int e = c-d;
	System.out.println("value after subtraction : "+e);
	System.out.println();
	System.out.println("Enter a value for multiplication : ");
	int f = sc.nextInt();
	mul(e,f);
}
void mul(int e, int f) {
	int g = e*f;
	System.out.println("value after multiplication : "+g);
	System.out.println();
	System.out.println("enter a value for division");
	int h= sc.nextInt();
	div(g,h);

}
 void div(int g, int h) {
	 int i = g/h;
	 System.out.println("value after division: "+i);
}
	 void main() {
		 System.out.println("Enter A value : ");
			int a = sc.nextInt();
			System.out.println("enter B value : ");
			int b = sc.nextInt();
		add(a,b);

	}

}
