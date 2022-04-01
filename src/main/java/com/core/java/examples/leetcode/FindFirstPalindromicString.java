package com.core.java.examples.leetcode;

public class FindFirstPalindromicString {

    public static void main(String[] args) {

    }

    public String firstPalindrome(String[] words) {
        StringBuilder sb = null;

        for(String s: words){
            sb = new StringBuilder(s);
            System.out.println("sb: "+sb.toString());
            if(s.equals(sb.reverse().toString())){
                return s;
            }
        }
        return "";
    }
}
