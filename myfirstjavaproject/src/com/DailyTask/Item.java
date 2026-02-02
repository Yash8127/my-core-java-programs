package com.DailyTask;

public class Item {

	String itemName;
	int price;
	int code;

	public Item(String itemName, int price, int code) {
		this.itemName = itemName;
		this.price = price;
		this.code = code;
	}

	boolean isFree() {
		int temp = code;
		int r = 0;
		int rev = 0;
		while (code != 0) {
			r = code % 10;
			rev = rev * 10 + r;
			code /= 10;
		}
		if (temp == rev)
			return true;
		else
			return false;
	}
}
