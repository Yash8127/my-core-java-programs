package com.array;
//Input  : [9, 8, 9]
//Output : [9, 9, 0]
//Input  : [9, 9, 9]
//Output : [1, 0, 0, 0]
import java.util.Arrays;

public class TestDemo7 {

	public static int[] plusOne(int[] digits) {

		// Traverse from last index to first
		for (int i = digits.length - 1; i >= 0; i--) {

			// If digit is less than 9, just add 1 and return
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			// If digit is 9, make it 0 and continue loop (carry)
			digits[i] = 0;
		}

		// If all digits were 9, create new array with size +1
		int[] result = new int[digits.length + 1];
		result[0] = 1; // Remaining digits are already 0

		return result;
	}

	public static void main(String[] args) {

		int[] digits1 = { 9, 8, 9 };
		int[] digits2 = { 9, 9, 9 };

		System.out.println("Input  : " + Arrays.toString(digits1));
		System.out.println("Output : " + Arrays.toString(plusOne(digits1)));

		System.out.println();

		System.out.println("Input  : " + Arrays.toString(digits2));
		System.out.println("Output : " + Arrays.toString(plusOne(digits2)));
	}
}
