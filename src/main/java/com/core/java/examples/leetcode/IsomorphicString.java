package com.core.java.examples.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {

    public static void main(String[] args) {
    String s ="badc";
    String t = "baba";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character,Character> mapping = new HashMap<>();
        Map<Character,Character> revMapping = new HashMap<>();

        if(s.length()!= t.length())
            return false;

        for(int i=0;i<s.length();i++){
            if(mapping.containsKey(s.charAt(i))){
                if(mapping.get(s.charAt(i)) != t.charAt(i)){
                    return  false;
                }
            }else if(revMapping.containsKey(t.charAt(i))){
                if(mapping.get(t.charAt(i)) != s.charAt(i)){
                    return  false;
                }
            }else{
                System.out.println("else-reach "+s.charAt(i));
                mapping.put(s.charAt(i),t.charAt(i));
                revMapping.put(t.charAt(i),s.charAt(i));
            }
        }
        System.out.println("Mapping "+ mapping);
        System.out.println("revMapping  "+ revMapping);
        return true;
    }

}
