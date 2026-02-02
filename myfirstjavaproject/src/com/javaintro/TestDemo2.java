package com.javaintro;

public class TestDemo2 {
	{
		System.out.println("Hello instance block");		
	}
	public static void main(String[] args) {
		System.out.println("Main method started!");
		
	}
	static {
		System.out.println("Hello static block");
	}
}
