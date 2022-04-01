package com.core.java.examples.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class SortingTheSentence {

    public static void main(String[] args) {

        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    public static String sortSentence(String s) {
        Map<Integer,String> sorted = new TreeMap<>();
        int counter  =0;
        String[] strArr = s.split(" ");
        for(String str:strArr){
            String s1 = str.substring(str.length()-1);
            String s2 = str.substring(0,str.length()-1);

            sorted.put(Integer.parseInt(s1),s2);
            counter ++;
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer,String> entry: sorted.entrySet()){
            sb.append(entry.getValue());
            counter --;
            if(counter>0) {
                sb.append(" ");
            }
        }

    return sb.toString();
    }



}
