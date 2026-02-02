package com.constructor;

public class Cricketer {

	String playerName;
	String format;
	int runs;
	int wickets;
	int matchesPlayed;

	Cricketer(String playerName, String format, int runs, int wickets, int matchesPlayed) {
		this.playerName = playerName;
		this.format = format;
		this.runs = runs;
		this.wickets = wickets;
		this.matchesPlayed = matchesPlayed;
		display();
	}

	void display() {
		System.out.println("******************");
		System.out.println("PLAYER NAME: " + playerName);
		System.out.println("FORMAT: " + format);
		System.out.println("MATCHES PLAYED: " + matchesPlayed);
		System.out.println("RUNS SCORED: " + runs);
		System.out.println("WICKETS TAKEN: " + wickets);
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		new Cricketer("MS Dhoni", "ODI", 10773, 0, 350);
		new Cricketer("Rohit", "ODI", 11768, 8, 270);
		new Cricketer("Virat", "ODI", 13800, 4, 292);
	}
}
