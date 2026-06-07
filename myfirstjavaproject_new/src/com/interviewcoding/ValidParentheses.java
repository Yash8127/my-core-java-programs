package com.interviewcoding;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	static boolean isValid(String str) {

		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((ch == '{' && top != '}') || ch == '[' && top != ']' || ch == '(' && ch != ')') {
					return false;
				}
			}
		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression ");
		String str = sc.next();
		System.out.println(isValid(str));
	}

}
