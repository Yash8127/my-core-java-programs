package com.constructor;

public class CopyConstructorDemo1 {
	String name;
	int id;
	int salary;
	CopyConstructorDemo1(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	CopyConstructorDemo1(CopyConstructorDemo1 r){
		r.name=name;
		r.id=id;
		r.salary=salary;
	}
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		CopyConstructorDemo1 a = new CopyConstructorDemo1(101,"Yaswanth",3500000);
		a.display();
		CopyConstructorDemo1 b = new CopyConstructorDemo1(a);
		b.display();
	}

}
