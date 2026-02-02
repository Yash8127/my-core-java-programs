package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseriliazble {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\varma\\serliaze.txt");
		try (ObjectInputStream ois = new ObjectInputStream(fis)) {
			Student s = (Student) ois.readObject();

			System.out.println(s.id + " " + s.uname + " " + s.pass);
		}

	}

}
