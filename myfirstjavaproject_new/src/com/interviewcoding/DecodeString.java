package com.interviewcoding;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		String s = "3[a2[c]]";

		System.out.println(decodeString(s));
	}

	private static String decodeString(String s) {
		Stack<Integer> countStack = new Stack<Integer>();
		Stack<String> stringStack = new Stack<String>();

		String currentString = "";
		int number = 0;

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				number = number * 10 + (ch - '0');
			} else if (ch == '[') {
				countStack.push(number);
				stringStack.push(currentString);
				number = 0;
				currentString = "";

			} else if (ch == ']') {
				int repeat = countStack.pop();
				String previousString = stringStack.pop();
				StringBuilder temp = new StringBuilder(previousString);
				for (int i = 0; i < repeat; i++) {
					temp.append(currentString);
				}
				currentString = temp.toString();
			} else {
				currentString += ch;
			}
		}

		return currentString;
	}

}
