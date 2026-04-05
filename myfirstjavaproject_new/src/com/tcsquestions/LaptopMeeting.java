package com.tcsquestions;

import java.util.Scanner;

public class LaptopMeeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int meetingDuration = sc.nextInt();

		int count = 0;

		for (int i = 0; i < N; i++) {
			if (arr[i] >= meetingDuration) {
				count++;
			}
		}

		System.out.println(count);

		sc.close();
	}
}