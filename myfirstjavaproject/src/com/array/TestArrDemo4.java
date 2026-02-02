package com.array;

// WAP 
//ex:arr= {1,0,2,0,3,0}
//output:1,2,3,0,0,0
public class TestArrDemo4 {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		int[] arr = { 1, 0, 0, 0, 0, 2, 0, 3, 0 };
		int temp = 0;
		int n = arr.length;
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
