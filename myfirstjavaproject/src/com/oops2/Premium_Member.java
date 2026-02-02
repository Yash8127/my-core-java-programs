package com.oops2;

public class Premium_Member extends LibraryMember {
	public Premium_Member(String name, int borredBooks) {
		super(name, borredBooks);
	}

	public int calculateFee() {
		return getcalculateFee() * 5;
	}

}
