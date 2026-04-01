package com.stringhandling;

public class ReArrangeTheSentence {

	private static void reArrange(String sentence) {
		String[] words = sentence.split(" ");
		String[] reWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int index = 0;
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (Character.isDigit(ch)) {
					index = ch - '0';
					reWords[index - 1] = word;
				}

			}

		}
		System.out.println("Correct Order of  Sentence:");
		for (String s : reWords) {
			s = s.replaceAll("\\d", "");
			System.out.print(s + " ");
		}
	}

	// anthoer method
	public static void reArrange1(String sentence) {
		String[] words = sentence.split(" ");
		String res = "";
		int n = 1;
		for (String word : words) {
			for (String word1 : words) {
				if (word1.contains(n + "")) {
					res += word1.replaceAll(n + "", " ");
					n++;
				}
			}

		}

		System.out.println(res);
	}

	private static void rearrangeBest(String sentence) {
		String[] words = sentence.split(" ");
		String[] result = new String[words.length];

		for (String word : words) {
			int pos = word.charAt(word.length() - 1) - '0';
			result[pos - 1] = word.substring(0, word.length() - 1);
		}
		System.out.println(String.join(" ", result));

	}

	public static void main(String[] args) {
		System.out.println("main method started\n");
		String sentence = "am2 I1 to4 going3 town6 home5";
//		reArrange(sentence);
//		reArrange1(sentence);
		rearrangeBest(sentence);
	}

}
