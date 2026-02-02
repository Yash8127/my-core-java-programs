package com.oops2;

public class Book extends Item {
	private String author;

	public Book() {

	}

	public Book(String author, int id, String title) {
		this.author = author;
		super(id, title);
	}

	@Override
	public void getShowDetails() {
		super.getShowDetails();
		System.out.println("Athor of the Book: " + author);
	}

}
