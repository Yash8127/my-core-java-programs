package com.oops2;

public class Item {
	private String title;
	private int id;

	public Item() {

	}

	public Item(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public void getShowDetails() {
		System.out.println("Title of the book: " + title);
		System.out.println("Id of the Book:" + id);
	}

}
