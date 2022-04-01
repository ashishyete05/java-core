package com.core.java.examples.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class StringCompression {

    public static void main(String[] args) {
     //  char []chars = {'a','a','b','b','c','c','c'};
        char []chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress1(chars));
    }

    public static int compress1(char[] chars) {

        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray())
                    chars[indexAns++] = c;
        }
        return indexAns;
    }
}
