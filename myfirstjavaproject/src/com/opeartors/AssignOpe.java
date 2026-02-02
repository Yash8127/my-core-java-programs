package com.opeartors;

// = , += , -= , *= ,/= , %=
public class AssignOpe {

	public static void main(String[] args) {
		int a = 10;//= is used to assign a value to variable 
		int b = 20;
		
		System.out.println(a+=b);//30 --> a = a+b;
		System.out.println(a-=b);//10 --> a = a-b;
		System.out.println(a*=b);//200 --> a = a*b;
		System.out.println(a/=b);//10 --> a = a/b;

	}

}
