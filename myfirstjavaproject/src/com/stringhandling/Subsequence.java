package com.stringhandling;

public class Subsequence {

    private static boolean isSub(String s1, String s2) {

        int i = 0; // pointer for s1
        int j = 0; // pointer for s2

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                i++;   // move only when matched
            }

            j++;       // always move in s2
        }

        return i == s1.length();
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        System.out.println(isSub("abc", "abdghc")); // true
        System.out.println(isSub("aec", "abcde"));   // false
        System.out.println(isSub("cba", "abc"));     // false
    }
}

