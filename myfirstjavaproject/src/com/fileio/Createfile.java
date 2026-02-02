package com.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException {
		System.out.println("main  method started");
		File f = new File("C:\\varma\\yaswanth.txt");
		if (f.createNewFile()) {
			System.out.println("File has been created successfully in given location");
		} else {
			System.out.println("File already exists");
		}
		try (FileReader fr = new FileReader(f)) {
			int i = fr.read();

			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}
		}
		try (FileWriter fw = new FileWriter(f, true)) {
			String s = "Congrats You have Select for this Role";
			fw.write('\n');
			fw.write(s);
			fw.flush();
		}
	}

}
