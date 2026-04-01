package com.oops3;

public interface InterfaceTest1 {

	public default void hello() {
		System.out.println("hello method  from interface1");
	}
	public default void hi() {
		System.out.println("hi method  from interface1");
	}
	public static void bolo() {
		System.out.println("bolo method  from interface1");
	}
	
	public static void bye() {
		System.out.println("bye method  from interface1");
	}

}
