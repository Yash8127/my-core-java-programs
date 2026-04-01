package com.collections;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Stack<String> stack = new Stack<>();
		stack.add("Java");
		stack.add("Python");
		stack.add("C++");
		stack.pop();
		System.out.println(stack);
	}

}
