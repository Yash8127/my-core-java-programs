package com.oops3;

public class TestInhDemo1 implements InterfaceTest2 {

	public static void main(String[] args) {

		InterfaceTest2 in2 = new TestInhDemo1();

		in2.bye();
		in2.bolo();
		InterfaceTest1 in1 = new TestInhDemo1();
		in1.hello();
		in1.hi();
	}

}
