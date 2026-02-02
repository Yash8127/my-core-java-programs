package com.array;

//input:
//2 1 3 4 
//5 6 7 3 
//2 4 5 8 
//2 8 4 2 
//****************
//reverse the even rows then square the diagnol remaining elements multiply by 2
//output
//4  2  6  8 
//10 36 14 6 
//4  8  25 16 
//4  16  8 4 
import java.util.Arrays;

public class TestDemo8 {

	static void evenRowReverse(int num[][]) {
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0) {
				int start = 0;
				int end = num[i].length - 1;
				int temp = 0;
				while (start < end) {
					temp = num[i][end];
					num[i][end] = num[i][start];
					num[i][start] = temp;
					start++;
					end--;
				}
			}
		}

	}

	static void squareDiagnolRemaminingMultiplyBy2(int num[][]) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i == j) {
					num[i][j] = num[i][j] * num[i][j];
				} else
					num[i][j] = num[i][j] * 2;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("main method Started");
		System.out.println("******************************");
		int num[][] = { { 4, 3, 1, 2 }, { 5, 6, 7, 3 }, { 8, 5, 4, 2 }, { 2, 8, 4, 2 } };

//		 orginal array representation
		for (int num1[] : num) {
			for (int num2 : num1) {
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
		evenRowReverse(num);
		squareDiagnolRemaminingMultiplyBy2(num);
		System.out.println("***************************");
		System.out.println("Requried Matrix");
		for (int num1[] : num) {
			for (int num2 : num1) {
				System.out.print(num2 + " ");
			}
			System.out.println();
		}
//representation of 2D array with Arrays.toString() method
//		for (int arr[] : num) {
//			System.out.println(Arrays.toString(arr));
//		}
//		System.out.println();
//		System.out.println("Requried Matrix");
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				System.out.print(num[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
