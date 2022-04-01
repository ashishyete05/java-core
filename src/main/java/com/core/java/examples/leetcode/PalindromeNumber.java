package com.core.java.examples.leetcode;

public class PalindromeNumber {

    public static void main(String[] args) {
            System.out.println(isPalindrome(12231));
    }

    public static boolean isPalindrome(int x) {
        int initialVal = x;
        if(x<0)
            return false;
        int revNum = 0;
        while(x>0){
            revNum = revNum*10 + x%10;
            x/=10;
        }
        System.out.println("x : "+initialVal + " Reversed X : "+revNum);
         return (initialVal == revNum) ? true:false;
    }

}
