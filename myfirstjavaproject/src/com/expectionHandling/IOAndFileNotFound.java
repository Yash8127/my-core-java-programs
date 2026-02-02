package com.expectionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOAndFileNotFound {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		System.out.println("Main method started");
		File f = new File("C:\\varma\\java.txt");

		FileReader fr = new FileReader(f);
		fr.read();

	}

}
