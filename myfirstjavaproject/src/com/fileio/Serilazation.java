package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	private static final long serialVersionUID = 733628406220986744L;
	transient	int id = 101;
	String uname = "yash8127";
	transient String pass = "yash@6300";
}

public class Serilazation {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		Student s = new Student();
		FileOutputStream fos = new FileOutputStream("C:\\varma\\serliaze.txt");
		try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(s);
		}

	}

}
