package com.core.java.examples.leetcode;

import java.util.*;

public class KeyboardRow {

    public static void main(String[] args) {
        System.out.println(findWords(new String []{"Hello","Alaska","Dad","peace"}));
    }

    public static String[] findWords(String[] words) {
    String s1 = "QWERTYUIOPqwertyuiop";
    String s2 = "ASDFGHJKLasdfghjkl";
    String s3 = "ZXCVBNMzxcvbnm";

    Set<Character> hSet1 = new HashSet<>();
        Set<Character> hSet2 = new HashSet<>();
        Set<Character> hSet3 = new HashSet<>();

        for(Character c : s1.toCharArray()){
            hSet1.add(c);
        }
        for(Character c : s2.toCharArray()){
            hSet2.add(c);
        }
        for(Character c : s3.toCharArray()){
            hSet3.add(c);
        }
        List<String> ll = new ArrayList<>();

        for(String word : words){
            boolean row1 = false;
            boolean row2 = false;
            boolean row3 = false;
            for(Character c: word.toCharArray()){
                if(hSet1.contains(c)){
                    row1=true;
                }else if(hSet2.contains(c)){
                    row2=true;
                }else if(hSet3.contains(c)){
                    row3=true;
                }
            }
            if(row1==true && row2==false && row3==false ||row1==false && row2==true && row3==false || row1==false && row2==false && row3==true) {
                ll.add(word);
            }
            System.out.println(ll);
        }
        String[] strings = ll.stream().toArray(String[]::new);
        return strings;

    }
}
