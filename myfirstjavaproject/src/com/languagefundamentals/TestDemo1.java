package com.languagefundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestDemo1 {
//	 Wrapper Object data Types
//	 Primitive to Wrapper conversion is happening automatically
//	 so we can consider this as Auto-Boxing
	// By default all object default values are null only.
	Integer i1 = 10;// int to Integer : primitive to Wrapper : Auto Boxing 1.5 version
	Byte b1 = (byte) 128;// byte to Byte
	Character c1 = 'A';// char to Character
	int i2 = i1;// Integer to int : Wrapper to Primitive : Auto Un-boxing
	// String Literal --> SCP : String Constant Pool.
	String s1 = "Srikanth";
	String s3 = new String();
	// String Object with new keyword --> Heap area directly and one copy will
	// create in SCP also
	String s2 = new String("Java");
	// If we want to initialize the values to an Object we must need to have a
	// constructors.
	BigInteger b2 = new BigInteger("98");
	BigInteger b3 = new BigInteger("5");
	BigDecimal b4 = new BigDecimal("10000000000000000000000000000000000000");
	void main() {
		System.out.println("main method started !");
		TestDemo1 t3 = new TestDemo1();
		// The operator + is undefined for the argument type(s) java.math.BigInteger,
		// java.math.BigInteger
//		System.out.println(t3.b2 + t3.b3);
		System.out.println(t3.b2.add(t3.b3));//103
		System.out.println(t3.b2.subtract(t3.b3));//93
		System.out.println(t3.b2.multiply(t3.b3));
		System.out.println(t3.b2.divide(t3.b3));//19
		System.out.println(t3.b2.mod(t3.b3));//3
		System.out.println(t3.i2 + t3.i1);
		System.out.println(t3.i1);// null
		System.out.println(t3.b1);// null
		System.out.println(t3.c1);// null
		System.out.println(t3.s1);// null
		System.out.println(t3.b2);// null
		System.out.println(t3.b3);// null
	}
}
