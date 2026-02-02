package com.starpatterns;

public class XpatternWithNameAndAlphates {

	public static void main(String[] args) {
		String s = "YASWANTH";
		char ch = 'A';

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i == j || i + j == 7)
					System.out.print(s.charAt(i) + "  ");

				else {
					if (ch == 'Z'+1) {
						ch = 'A';
					}
					System.out.print(ch++ + "  ");
				}

			}
			System.out.println();
		}

	}

}
