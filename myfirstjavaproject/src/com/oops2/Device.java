package com.oops2;

public class Device {
	boolean power;

	public boolean turnOn() {
		power = true;
		return power;
	}

	public boolean turnOff() {
		return power;
	}

	public boolean isPowerOn() {
		return power;
	}
}
