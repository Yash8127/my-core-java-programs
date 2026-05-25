package com.multithreading;

class SharedData {

	private int data;
	private boolean available = false;

	// Producer method
	public synchronized void produce(int value) {

		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		data = value;
		System.out.println("Produced : " + data);

		available = true;

		notify();
	}

	// Consumer method
	public synchronized void consume() {

		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Consumed : " + data);

		available = false;

		notify();
	}
}

class Producer extends Thread {

	SharedData sd;

	Producer(SharedData sd) {
		this.sd = sd;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			sd.produce(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread {

	SharedData sd;

	Consumer(SharedData sd) {
		this.sd = sd;
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			sd.consume();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerDemo {

	public static void main(String[] args) {

		SharedData sd = new SharedData();

		Producer p = new Producer(sd);
		Consumer c = new Consumer(sd);

		p.start();
		c.start();
	}
}