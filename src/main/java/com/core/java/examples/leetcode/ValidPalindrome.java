package com.core.java.examples.leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "0P";
        System.out.println(isPalindrome(s3));

    }

    public static boolean isPalindromeSlowSolution(String s) {

        if (s.isBlank() || s.isEmpty())
            return true;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append((s.toLowerCase().charAt(i)));
            }
        }
        String convString = sb.toString();

            return convString.equals(sb.reverse().toString()) ? true: false;
    }

    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            else {
                if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

}
