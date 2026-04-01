package com.collections;
import java.util.*;

class Transaction {
	String sender;
	String receiver;
	int timestamp;
	double amount;

	Transaction(String sender, String receiver, int timestamp, double amount) {
		this.sender = sender;
		this.receiver = receiver;
		this.timestamp = timestamp;
		this.amount = amount;
	}
}

public class TransactionMonitor {

	public static void validateTransactions(List<Transaction> list) {

		Set<String> seen = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {

			Transaction curr = list.get(i);

			// Rule 1: Duplicate check
			String key = curr.sender + "-" + curr.receiver;

			if (seen.contains(key)) {
				System.out.println("error duplication transaction");
				return;
			}
			seen.add(key);

			// Rule 2: Time difference check
			if (i > 0) {
				Transaction prev = list.get(i - 1);

				if (curr.timestamp - prev.timestamp > 60) {
					System.out.println("fraud detected");
					return;
				}
			}
		}

		// Rule 3: All valid
		System.out.println("all transaction are valid");
	}

	public static void main(String[] args) {

		List<Transaction> list = new ArrayList<>();

		list.add(new Transaction("A", "B", 10, 100));
		list.add(new Transaction("B", "C", 50, 200));
		list.add(new Transaction("C", "D", 100, 300));

		validateTransactions(list);
	}
}