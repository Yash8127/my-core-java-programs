package com.stringhandling;

//input:a2b3
//output:aabbb
public class AppendAsperNumber {

	public static void main(String[] args) {
		System.out.println("main method started");

		String str = "a2b3";
		String resultstr = "";
		for (int i = 0; i < str.length(); i += 2) {
			char ch = str.charAt(i);
			int j = str.charAt(i + 1) - '0';
			while (j > 0) {
				resultstr = resultstr + ch;
				j--;
			}

		}
		System.out.println(resultstr);
	}

}
