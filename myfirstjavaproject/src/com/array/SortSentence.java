package com.array;

//input:"is1 Thi0s T3est 2a";
//output: This is a Test
public class SortSentence {

	public static String sortSentence(String s) {
		// for one space
		// String[] words = s.split(" ");
		// Split by multiple spaces
		String sortSentence = "";
		String[] words = s.split("\\s+");
		String[] result = new String[words.length];
		for (String word : words) {
			int pos = -1;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				// Checks whether the character is a number.
				if (Character.isDigit(ch)) {
					pos = ch - '0';
					break;
				}

			}
			// remove digit and place word
			String cleanWord = word.replaceAll("\\d", "");
			result[pos] = cleanWord;
		}

		for (String word : result) {
			sortSentence += word + " ";
		}
		// trim() removes extra space at end.
		return sortSentence.trim();
	}

	public static void main(String[] args) {
		String s = "is2 3yaswanth m0y nam1e g4ood mori5ning";
		System.out.println(sortSentence(s));
	}
}
