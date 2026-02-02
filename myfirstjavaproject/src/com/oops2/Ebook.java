package com.oops2;

public class Ebook extends Book {
	private double fileSize;

	public Ebook(String title, int id, String author, double fileSize) {
		super(title, id, author);
		if (fileSize > 0 && fileSize < 500)
			this.fileSize = fileSize;
		else
			System.out.println("Invalid Size");

	}

	@Override
	public void getShowDetails() {
		super.getShowDetails();
		System.out.println("File Size: " + fileSize + "Mb");
	}

}
