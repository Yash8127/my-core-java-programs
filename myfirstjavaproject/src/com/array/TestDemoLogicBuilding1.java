package com.array;

//input:123, 342,5463
//output:312 234 3546 
public class TestDemoLogicBuilding1 {

	public static void main(String[] args) {

		System.out.println("main method started");
		int[] arr = { 123, 342, 5463 };
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int r = 0;
			int l = String.valueOf(n).length();
			r = n % 10;
			n /= 10;
			n = (int) (r * Math.pow(10, (l - 1)) + n);
			System.out.print(n + " ");
		}

	}

}
