package com.core.java.examples.leetcode;

public class TruncatingStringSentence {

    public static void main(String[] args) {
     String s = "What is the solution to this problem";
     int k = 4;
        System.out.println(truncateSentence(s,k));
    }
    public static String truncateSentence(String s, int k) {
        String [] strArr = s.split(" ");
        int len = strArr.length;
        StringBuilder sb = new StringBuilder();
        if(len <= k || k==0)
            return s;
        for(int i=0;i<k;i++){
            sb.append(String.join(" ",strArr[i]));
        }
        return sb.toString();
    }
}
