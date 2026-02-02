package com.expectionHandling;

import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptions {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException, InterruptedException {
		System.out.println("main method started");
		Class.forName("com.javaintro.Cricketer");
		System.out.println("class loaded succefully");
		FileReader fr = new FileReader("C:\\varma\\java.txt");// FileNotFound
		fr.read();// IOException
		DriverManager.getConnection("jdbc:mysql://localhost:3306/yaswanth", "root", "root");
		Thread.sleep(1000);

	}

}
