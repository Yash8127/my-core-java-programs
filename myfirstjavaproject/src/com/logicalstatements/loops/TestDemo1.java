package com.logicalstatements.loops;
//input:98007645120

//output:0 0 0 1 2 4 5 6 7 8 9 
public class TestDemo1 {

	static void intToArray(int num) {
		int temp = num;
		int count = 0;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		int arr[] = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			arr[i] = num % 10;
			num /= 10;
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		long num = 98007645120l;
//		intToArray(num);
		for (int i = 0; i <= 9; i++) {
			long temp = num;
			while (temp > 0) {
				long rem = temp % 10;

				if (rem == i) {
					System.out.print(rem + " ");
				}
				temp /= 10;
			}
		}

	}

}
