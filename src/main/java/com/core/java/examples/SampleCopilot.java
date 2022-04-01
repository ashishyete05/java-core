package com.core.java.examples;

public class SampleCopilot {

    public static void main(String[] args) {

    }

    // check to see if String is Anagram
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        java.util.Arrays.sort(s1Array);
        java.util.Arrays.sort(s2Array);

        return new String(s1Array).equals(new String(s2Array));
    }
}
