package com.javaintro;

public class Blocks {
	static {
		Blocks t1= new Blocks();
		System.out.println("Hello static Block1");
	}
	static {
		System.out.println("Hello static Block2 ");
	}
	{
		System.out.println("Hello instance Block1");
	}
	Blocks t1= new Blocks();
	public static void main(String[] args) {
		System.out.println("main method started !");
	}
}
