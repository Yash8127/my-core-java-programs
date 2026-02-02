package com.fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergingFiles {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method started");

		try {
			String file1 = "C:\\varma\\file1.txt";

			try (FileWriter fw1 = new FileWriter(file1)) {
				fw1.write("hello from file1");
				fw1.flush();
			}
			String file2 = "C:\\vara\\file2.txt";
			try (FileWriter fw2 = new FileWriter(file2)) {
				fw2.write("hello from file2");
				fw2.flush();
			}
			String merged = "C:\\varma\\merge.txt";
			try (FileWriter merge = new FileWriter(merged);
					FileReader fr1 = new FileReader(file1);
					FileReader fr2 = new FileReader(file2)) {
				// coping from file 1
				int i = fr1.read();
				while (i != -1) {
					merge.write((char) i);
					i = fr1.read();
				}
				merge.write("\n");
				// coping from 2
				int j = fr2.read();
				while (j != -1) {
					merge.write((char) j);
					j = fr2.read();
				}
			}
		} catch (IOException e) {
			System.err.println("Error while creating and merging files: " + e.getMessage());

		}

	}

}
