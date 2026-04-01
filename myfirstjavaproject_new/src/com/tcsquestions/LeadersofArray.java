package com.tcsquestions;

public class LeadersofArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr = { 2, 4, 5, 1, 3 };
		System.out.print("Leaders of any Array: ");
		int leader = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > leader) {
				leader = arr[i];
				System.out.print(leader + " ");
			}

		}
	}

}
