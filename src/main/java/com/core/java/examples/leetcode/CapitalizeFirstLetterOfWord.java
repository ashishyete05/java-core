package com.core.java.examples.leetcode;

public class CapitalizeFirstLetterOfWord {
    public static void main(String[] args) {

        String s ="ashish";
        System.out.println("Capitalize - "+capitalizeLetter(s));

        String str ="i loVE leetCode";
        System.out.println("Capitalize - "+capitalizeLetter1(str));
    }

    public static String capitalizeLetter(String s){
        String firstLetter = s.substring(0,1).toUpperCase();
        String otherLetter = s.substring(1);
        return firstLetter+otherLetter;
    }

    public static String capitalizeLetter1(String s) {
        String [] str = s.split(" ");
        int counter =str.length;
        StringBuilder sb = new StringBuilder();
        for(String str1: str){
            System.out.println("str1 : "+str1);
            if(str1.length()>3) {
                String s1 = str1.substring(0, 1).toUpperCase();
                String s2 = str1.substring(1).toLowerCase();
                sb.append(s1);
                sb.append(s2);
            }else
                sb.append(str1);
            counter--;
            if(counter>0)
            sb.append(" ");
        }
        return sb.toString();
    }
}
