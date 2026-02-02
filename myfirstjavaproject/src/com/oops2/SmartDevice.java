package com.oops2;

public class SmartDevice extends Device {

	public void useDevice() {
		if (isPowerOn()) {
			System.out.println("Ready to use");
		} else
			System.out.println("Please turn on the device");
	}

}
