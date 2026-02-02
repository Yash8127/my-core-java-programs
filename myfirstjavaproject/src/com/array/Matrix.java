package com.array;


//1 1 0 
//1 1 1    
//0 1 1 
//result matrix:
//	0 0 0 
//	0 1 0 
//	0 0 0 

public class Matrix {

	public static void main(String[] args) {
		System.out.println("main method started");
		int[][] m = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } };
		boolean[] row = new boolean[3];
		boolean[] col = new boolean[3];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}

			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (row[i] || col[j]) {
					m[i][j] = 0;
				}
			}
		}

		// matrix representation
		for (int[] n : m) {
			for (int num : n) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
