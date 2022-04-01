package com.core.java.examples.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NumOfWordsThatAppearSubString {

    public static void main(String[] args) {

        String [] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int counter =0;
        List<Character> ll = new ArrayList<>();
        for(Character c : word.toCharArray())
            ll.add(c);
        for(String s : patterns){
            for(Character c: s.toCharArray()){
                if(ll.contains(c)){
                    counter++;
                    break;
                }
            }
        }
    return counter;
    }


}
