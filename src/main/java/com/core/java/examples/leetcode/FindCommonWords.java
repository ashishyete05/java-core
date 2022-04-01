package com.core.java.examples.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonWords {

    public static void main(String[] args) {

        String words[] = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
        System.out.println(commonChars(words));
    }
//List<String>
    public static List<String> commonChars(String[] words) {

        List<String> ll = new ArrayList<>();
        int numOfWords=0;
        Map<Character,Integer> hMap = new HashMap<>();
        for(String s:words){
            numOfWords++;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(hMap.containsKey(c)){
                    hMap.put(c,hMap.get(c)+1);
                }else{
                    hMap.put(c,1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entrySet : hMap.entrySet()){
            if(entrySet.getValue()>=numOfWords){
               int loop = entrySet.getValue()/numOfWords;
               for(int i=0;i<loop;i++){
                   ll.add(entrySet.getKey().toString());
               }
            }
        }
        return ll;
    }
}
