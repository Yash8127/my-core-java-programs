package com.logicalstatements;

import java.util.Scanner;

public class RestaurantBillGenator {
	static {
		System.out.println("Welcome to the Friends Restaurant");
		System.out.println("***********************************");
	}

	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of items you want to Ordered? ");
		int numCount = sc.nextInt();
		System.out.println("**********************MENU*******************************");
		String itemsList = "STARTERS\n" + "*************\n" + "1.Veg Manchurian (Dry) — ₹140\n" + "2.Paneer 65 — ₹180\n"
				+ "3.Chicken 65 — ₹220\n" + "4.Chilli Chicken — ₹230\n" + "5.French Fries — ₹120\n" + "\n" + "NON-VEG\n"
				+ "******************\n" + "6.Chicken Biryani — ₹200\n" + "7.Mutton Biryani — ₹320\n"
				+ "8.Egg Curry — ₹130\n" + "9.Chicken Curry — ₹220\n" + "10.Fish Fry — ₹250\n ";
		System.out.println(itemsList);
		System.out.println("Choose Your Number as per your Food items\n");
		int total = 0;
		int price = 0;

		for (int i = 1; i <= numCount; i++) {
			System.out.println("Select items:");
			int itemNum = sc.nextInt();
			price = switch (itemNum) {
			case 1 -> 140;
			case 2 -> 180;
			case 3 -> 220;
			case 4 -> 230;
			case 5 -> 120;
			case 6 -> 200;
			case 7 -> 320;
			case 8 -> 130;
			case 9 -> 220;
			case 10 -> 250;
			default -> {
				System.out.println("invalid");
				yield 0;
			}
			};
			total = price + total;
		}
		System.out.println("***********************************");
		System.out.println("------------------BILL--------------------------");
		System.out.println("Number of items you ordered: " + numCount);
		System.out.println("Total price: " + total);
		System.out.println("Average per item: " + total / numCount);
		System.out.println("***************************************");

		sc.close();
	}
}
