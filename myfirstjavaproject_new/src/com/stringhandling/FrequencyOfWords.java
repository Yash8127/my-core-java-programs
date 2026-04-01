package com.stringhandling;

public class FrequencyOfWords {

	public static void main(String[] args) {
		String sen = "java hello java spring spring spring";
		String[] words = sen.split(" ");
		int n = words.length;

		for (int i = 0; i < n; i++) {
			String current = words[i];
			if (current.equals("0")) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (current.equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}

			System.out.println(current + " :" + count);
		}
	}

}
