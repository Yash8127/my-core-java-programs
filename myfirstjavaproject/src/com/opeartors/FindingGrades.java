package com.opeartors;

import java.util.Scanner;

public class FindingGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Students marks: ");
		int a = sc.nextInt();
		String grade = (a >= 90 && a <= 100) ? "A PASS"
				: (a >= 80 && a <= 89) ? "B PASS"
						: (a >= 70 && a <= 79) ? "C PASS" :
							(a >= 60 && a <= 69) ? "D PASS" :
								(a>100)?"MARKS OF OUT RANGE":
									"FAIL";
		System.out.println("GRADE: " + grade);
		sc.close();

	}

}
