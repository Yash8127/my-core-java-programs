package com.collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSetDemo1 {

	public static void main(String[] args) {

		System.out.println("Main methd started");

		Set<Integer> ss = new HashSet<>();

		ss.add(13);//13
		ss.add(22);//6
		ss.add(16);//0
		ss.add(30);//14
		ss.add(32);//0
		System.out.println(ss);

	}

}
