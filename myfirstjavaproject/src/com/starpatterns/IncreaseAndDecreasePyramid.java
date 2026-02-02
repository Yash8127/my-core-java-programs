package com.starpatterns;
//    1
//   123
//  12345
// 1234567
//123456789
// 1234567
//  12345
//   123
//    1


public class IncreaseAndDecreasePyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
