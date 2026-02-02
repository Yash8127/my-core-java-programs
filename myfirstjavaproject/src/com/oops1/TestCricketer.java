package com.oops1;

public class TestCricketer {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		System.out.println("*********************");
		Cricketer s1 = new Cricketer();
		s1.setName("DHONI");
		s1.setJno(7);
		s1.setAge(45);
		System.out.println(s1.getName());
		System.out.println(s1.getJno());
		System.out.println(s1.getAge());

	}

}
