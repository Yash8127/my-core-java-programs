package com.DailyTask;

public class VendingMachine {

	int coin;

	void insertCoin(int coin, Item a) {
		if (coin > 0 && coin <= a.price) {
			this.coin = coin;
		} else {
			System.out.println("invalid coins");
			System.exit(1);
		}

	}

	void byItem(Item a) {
		if (a.isFree()) {
			System.out.println("Congrats,You Bought it free with code");
		} else {
			System.out.println("You need to pay Amount: " + (a.price - coin));
		}

	}

}
