package com.opeartors;
// == , < , > , <= , >= ,!=
public class RelationalOp {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println(a==b);//false
		System.out.println(a<b);//true
		System.out.println(a>b);//false
		System.out.println(a<=b);//true
		System.out.println(a>=b);//false
		System.out.println(a!=b);//true
		System.out.println(!(a==b));//true
	}

}
