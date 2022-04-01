package com.core.java.examples.leetcode;

public class MaximumNumberOfWordsInASentence {

    public static void main(String[] args) {
        String [] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(str));

    }

    public static int mostWordsFound(String[] sentences) {

        int count=0;

        for(String s: sentences){
       String[] res = s.split(" ");
        if(res.length > count){
            count = res.length;
        }
        }
        return count;
    }
}
