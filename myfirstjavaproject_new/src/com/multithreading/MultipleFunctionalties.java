package com.multithreading;

class Audio extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("audio : " + i);
		}
	}

}

class Video extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("video : " + i);
		}
	}

}

public class MultipleFunctionalties {

	public static void main(String[] args) {
		System.out.println("main method started");
		Audio a = new Audio();
		a.start();
		Video v = new Video();
		v.start();

	}

}
