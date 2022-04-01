package com.core.java.examples.leetcode;

import java.util.HashMap;
import java.util.Map;

public class VaildAnagram {
    public static void main(String[] args) {
        String s ="aacc";
        String t = "ccac";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {

        boolean isAnagram = true;
        if(s.length()!=t.length()) {
            isAnagram = false;
        }
        Map<Character,Integer> hMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hMap.containsKey(s.charAt(i))){
                hMap.put(s.charAt(i),hMap.get(s.charAt(i))+1);
            }else{
                hMap.put(s.charAt(i),1);
            }
        }
        System.out.println("hMap: - 1" +hMap);
        for(int i=0;i<t.length();i++){
            if(hMap.containsKey(t.charAt(i))){
                hMap.put(t.charAt(i),hMap.get(t.charAt(i))-1);
            }
            else{
                isAnagram=false;
                break;
            }
        }
        System.out.println("hMap: - 2" +hMap);
        for(Map.Entry<Character,Integer> entrySet: hMap.entrySet()){
            if(entrySet.getValue()>0){
                isAnagram=false;
                break;
            }
        }
        return isAnagram;
    }
}
