package com.array;
//input:14 22 44
//--> 4
//output: 4 is repeated 3 times
import java.util.Scanner;

public class FindRepeatedDigitsInElements {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter Elements for array");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("enter a single digit which you want to know repeations\n" + "of digit in Array ");
		int a = sc.nextInt();

//		int numbers[] = { 122, 222, 312, 412 };
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			int n = numbers[i];
			while (n != 0) {
				int r = n % 10;
				n = n / 10;
				if (r == a)
					count++;
			}
		}
		System.out.println(a + " is repeated " + count + " times");

		sc.close();
	}

}
