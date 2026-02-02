package com.array;

//find the longest word in an array
public class LongestWordInArray {

	public static void main(String[] args) {
		System.out.println("Main method started");
		System.out.println("*************************");
		String name[] = { "java", "yaswant", "is", "simple", "am", "when", "you", "pratice", "daily" };
//		String n[] = name;
//		n[0] = "yash";
//		for (String s : n) {
//			System.out.println(s);
//		}
		String maxword = name[0];
		String minword = name[0];

		for (int i = 0; i < name.length; i++) {
			if (maxword.length() < name[i].length()) {
				maxword = name[i];
			} else if (minword.length() > name[i].length()) {
				minword = name[i];
			}

		}
		System.out.print("Longest word in Array: ");
		for (int i = 0; i < name.length; i++) {
			if (maxword.length() == name[i].length()) {
				System.out.print(name[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Shortest Words in an array: ");
		for (int i = 0; i < name.length; i++) {
			if (minword.length() == name[i].length()) {
				System.out.print(name[i] + " ");
			}
		}
		System.out.println();
		System.out.println("********************************");
		System.out.println("Main method ended");

	}

}
