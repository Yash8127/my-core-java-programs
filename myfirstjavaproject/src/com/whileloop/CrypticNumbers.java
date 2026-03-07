package com.whileloop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


//This problem asks you to print Cryptic Numbers between L and R.
//A number is Cryptic if it satisfies all 4 conditions:
//
//1️⃣ Divisible by 7 → num % 7 == 0
//2️⃣ Not divisible by 5 → num % 5 != 0
//3️⃣ Not a palindrome → reverse of number ≠ number
//4️⃣ No repeated digits

public class CrypticNumbers {

	public static List<Integer> isCryptic(int n1, int n2) {
		List<Integer> range = new ArrayList<>();
		for (int i = n1; i <= n2; i++) {
			int cNum = i;
			if (cNum % 7 == 0 && cNum % 5 != 0 && !isPal(cNum) && !isRepeatedDigits(cNum)) {
				range.add(cNum);
			}

		}

		return range;
	}

	public static boolean isPal(int n) {

		int temp = n;
		int rev = 0;
		while (n > 0) {
			int digit = n % 10;
			rev = digit + rev * 10;
			n /= 10;
		}

		return temp == rev;

	}

	public static boolean isRepeatedDigits(int n) {
		Set<Integer> set = new HashSet<>();
		while (n > 0) {
			int digit = n % 10;
			if (!set.add(digit)) {
				return true;
			}
			n /= 10;
		}
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range for checking the cryptic Numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		List<Integer> result = isCryptic(n1, n2);

		if(result.isEmpty()){
		    System.out.println(-1);
		}
		else{
		    for(int num : result){
		        System.out.print(num + " ");
		    }
		}
		sc.close();
	}

}
