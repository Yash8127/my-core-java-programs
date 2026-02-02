package com.array;

//input---->1 2 3 2 3
//output: 1 Frequency is 1 times
//        2 Frequency is 2 times
//        3 Frequency is 2 times
import java.util.Scanner;

public class FindFrequencyOfElemets {

	static void findFrequency(int[] arr) {
		int s = arr.length;

		boolean ar[] = new boolean[s];
		for (int i = 0; i < s; i++) {
			int count = 1;
			if (ar[i])
				continue;

			for (int j = 0; j < s; j++) {
				if (arr[i] == arr[j] && i != j) {
					count++;
					ar[j] = true;

				}

			}
			System.out.println(arr[i] + " Frequency is " + count + " times");
		}

	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size");
		int s = sc.nextInt();
		int arr[] = new int[s];// 1,1,2,3
		System.out.println("Enter a elements for Array:" + s);
		for (int i = 0; i < s; i++) {
			arr[i] = sc.nextInt();
		}
		findFrequency(arr);

		sc.close();
	}

}
