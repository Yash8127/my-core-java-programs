package com.array;

public class LeadersOfArray {

	public static void main(String[] args) {
		System.out.println("main method started!");
		int[] arr = { 18, 17, 20, 3, 5, 2 };
//		int leader = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean s = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					s = false;
				}

			}
			if (s) {
				System.out.print(arr[i]+" ");
			}
		}
//		ANOTHER METHOD
//		for (int i = n - 1; i >= 0; i--) {
//			if (arr[i] > leader) {
//				leader = arr[i];
//				System.out.print(leader + " ");
//			}
//		}
	}

}
