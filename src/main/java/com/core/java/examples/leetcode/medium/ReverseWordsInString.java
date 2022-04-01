package com.core.java.examples.leetcode.medium;

import java.util.Arrays;

public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {

        String[] strArr = s.trim().replaceAll("\\s+"," ").split(" ");
        System.out.println(Arrays.asList(strArr));
        StringBuilder sb = new StringBuilder();
        for(int i=strArr.length-1;i>=0;i--){
            if(!strArr[i].equals(" "))
            sb.append(strArr[i]);
            System.out.println("asdsadas - > "+strArr[i]);
            if(i > 0 && !strArr[i].equals(" "))
                sb.append(" ");
        }
        return sb.toString();
    }
}
