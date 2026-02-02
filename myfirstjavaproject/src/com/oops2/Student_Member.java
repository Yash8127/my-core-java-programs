package com.oops2;

public class Student_Member extends LibraryMember {

	public Student_Member(String name, int borredBooks) {
		super(name, borredBooks);
	}

	int calculateFee() {
		return getcalculateFee() * 2;
	}

}
