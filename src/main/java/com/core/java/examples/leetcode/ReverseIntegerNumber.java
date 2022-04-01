package com.core.java.examples.leetcode;

public class ReverseIntegerNumber {
    public static void main(String[] args) {
        int number = -4321;
        System.out.println("Passed number : "+number + " Reversed Number : "+reverseNumber(number));
    }

    public static int reverseNumber(int number) {

        int revNumber = 0;
        boolean isNumNegative = false;

        if (number < 0){
            isNumNegative = true;
            number*=-1;
        }

        while(number >0){
            revNumber = revNumber*10+number%10;
            number/=10;
        }

        return isNumNegative? (revNumber * -1): revNumber;




    }




}
