package com.core.java.examples.leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s ="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {

        String [] sArray = s.trim().split(" ");
        String res = sArray[sArray.length-1];
        return(res.length());
    }
}
