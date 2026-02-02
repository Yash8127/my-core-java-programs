package com.oops2;

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book("kalam", 101, "Wings of Fire");
		b1.getShowDetails();
		System.out.println("***************************************");
		Ebook eb1 = new Ebook("kalam", 101, "Wings of Fire",600);
		eb1.getShowDetails();
	}

}
