package com.starpatterns;

//    1 
//   1 1 
//  1 2 1 
// 1 3 3 1 
//1 4 6 4 1 

public class TrainglePattern {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(num + " ");
				num = num * (i - k) / k;
			}
			System.out.println();
		}
	}

}
