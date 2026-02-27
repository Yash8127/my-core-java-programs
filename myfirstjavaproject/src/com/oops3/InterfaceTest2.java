package com.oops3;

public interface InterfaceTest2 extends InterfaceTest1 {
	public default void hello() {
		System.out.println("hello method  from interface2");
	}

	public default void hi() {
		System.out.println("hi method  from interface2");
	}

	public default void bolo() {
		System.out.println("bolo method  from interface2");
	}

	public default void bye() {
		System.out.println("bye method  from interface2");
	}

}
