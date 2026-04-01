package com.stringhandling;

public class ExtractNumFromString {

	public static void main(String[] args) {
		System.out.println("Main method started");
		String str = "var12m2a2";
		String num = "";
		int sum = 0;
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				num += ch;
			} else {
				res.append(ch);
				if (!num.isEmpty()) {
					sum += Integer.parseInt(num);
					num = "";
				}
			}

		}

		System.out.println(res);
		System.out.println(sum);
	}

}
