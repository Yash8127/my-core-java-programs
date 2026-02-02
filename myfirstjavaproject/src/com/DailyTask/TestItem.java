package com.DailyTask;

public class TestItem {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Item i1 = new Item("Bike", 60000, 113);
		VendingMachine vm = new VendingMachine();
		vm.insertCoin(620000, i1);
		vm.byItem(i1);
	}

}
