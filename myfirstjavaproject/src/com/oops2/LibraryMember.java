package com.oops2;

public class LibraryMember {
	public LibraryMember(String bookName, int borred_Books) {
		this.bookName = bookName;
		this.borred_Books = borred_Books;
	}

	private String bookName;
	private int borred_Books;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBorred_Books() {
		return borred_Books;
	}

	public void setBorred_Books(int borred_Books) {
		this.borred_Books = borred_Books;
	}

	public int getcalculateFee() {
		return borred_Books;
	}

}
