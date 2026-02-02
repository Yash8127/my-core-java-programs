package com.languagefundamentals;
import java.math.BigDecimal;
import java.math.BigInteger;
public class WrapperObjectDataTypes {
	Integer i1 = 10;
	Byte b1;
	Character c1;
	String s1;
	BigInteger b2;
	BigDecimal b3;
	void main() {
		System.out.println("main method started !");
		WrapperObjectDataTypes t3 = new WrapperObjectDataTypes();
		System.out.println(t3.i1);// 0
		System.out.println(t3.b1);// 0
		System.out.println(t3.c1);//
		System.out.println(t3.s1);// null
		System.out.println(t3.b2);// not sure
		System.out.println(t3.b3);// not sure
	}
}

