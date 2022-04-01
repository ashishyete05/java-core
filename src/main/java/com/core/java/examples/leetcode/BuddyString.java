package com.core.java.examples.leetcode;

public class BuddyString {

    public static void main(String[] args) {

    }

    public static boolean buddyStrings(String s, String goal) {

        boolean isBuddy = true;

        if(s.length()!=goal.length()) {
            isBuddy = false;
        }
        else if(s.equals(goal)) {
            isBuddy = true;
        }else{
           StringBuilder sb = new StringBuilder();
           for(int i=goal.length()-1;i<=0;i--){
               sb.append(goal.charAt(i));
           }
           if(!sb.toString().equals(s)) {
               isBuddy = false;
           }

        }




        return isBuddy;
    }
}
