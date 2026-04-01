package com.array;

import java.util.Arrays;

public class BoatsToSavePeople {

	private static int numRescueBoats(int[] peopleWeight, int limit) {

		Arrays.sort(peopleWeight);// 1,2,4,6,6,7
		int left = 0;
		int right = peopleWeight.length - 1;
		int boats = 0;
		for (int person : peopleWeight) {
			if (person > limit) {
				return -1;
			}
		}
		while (left <= right) {
			if (peopleWeight[left] + peopleWeight[right] <= limit) {

				left++;
			}
			right--;
			boats++;
		}

		return boats;
	}

	public static void main(String[] args) {
		System.out.println("main method started\n");
		int[] peopleWeight = { 4, 6, 2, 6, 7, 1 };
		int limit = 8;
		int result = numRescueBoats(peopleWeight, limit);
		if (result == -1) {
			System.out.println("Rescue impossible: someone heavier than boat limit");
		} else {
			System.out.println("Minimum Boats required:" + result);
		}

	}

}
