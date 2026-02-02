package com.DailyTask;

public class LibrarySystem {
	static int maxbooks;
	static int memberid=0;
	int booksissued;
	static {
		maxbooks=5;
	}
	{
		memberid++;
	}
	static void libraryRule() {
		System.out.println("Each Student Can borrow upto only 5 books");
	}
	void studentDetails() {
		System.out.println("MemberId= "+memberid);
		System.out.println("books issued= "+booksissued);
		
	}

	public static void main(String[] args) {
		libraryRule();
		 System.out.println();
		 LibrarySystem a = new  LibrarySystem();
		 LibrarySystem b = new  LibrarySystem();
		 a.booksissued=2;
		 a.studentDetails();
		 b.booksissued=6;
		 b.studentDetails();
	}

}
