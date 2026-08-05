package com.interviewcoding;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindIphonevariants {

	public static void main(String[] args) {
		String input = "IPhone11AirpodIPhone12MacbookIPhone13Ipad";
		Pattern pattern = Pattern.compile("IPhone\\d+");
		Matcher matcher = pattern.matcher(input);
		List<String> variants = new ArrayList<>();
		while (matcher.find()) {

			variants.add(matcher.group());

		}
		System.out.println(variants);
	}

}
