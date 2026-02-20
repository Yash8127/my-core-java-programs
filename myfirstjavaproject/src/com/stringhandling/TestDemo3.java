package com.stringhandling;

public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		String str = "13313133";
		int n = str.length();
		int max = 0;
		int index = -1;
		for (int i = 0; i < n - 1; i++) {
			index = str.indexOf('1', index + 1);
			if (index != -1) {
				String s = str.substring(0, index) + str.substring(index + 1, n);
				int num = Integer.parseInt(s);
//				System.out.println(num);
				if (num > max) {
					max = num;
				}
			}

		}
		System.out.println("max number is: " + max);
//		for (int i = 0; i < n; i++) {
//			if (str.charAt(i) == '3') {
//				String str1 = str.substring(0, i) + str.substring(i + 1, n);
//				int currentNum = Integer.parseInt(str1);
//				System.out.println(str1);
//				if (currentNum > max) {
//					max = currentNum;
//				}
//			}
//
//		}
//
//		System.out.println("Max number is: " + max);
	}

}
