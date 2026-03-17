package com.tcsquestions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {

	public static void main(String[] args) {

		System.out.println("Main method Started");
		String s = "javaissimple";
		Set<Character> set = new HashSet<>();
		int left = 0;
		int maxLength = 0;
		int start = 0;
		for (int right = 0; right < s.length(); right++) {
			while (set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}

			set.add(s.charAt(right));
//			maxLength = Math.max(maxLength, right - left +1);
			if (right - left + 1 > maxLength) {
				maxLength = right - left + 1;
				start = left;
			}
		}
		System.out.println(
				"The Longest SubString Without Repeated Characters is : " + s.substring(start, start + maxLength));
		System.out.println(maxLength);
	}

}
