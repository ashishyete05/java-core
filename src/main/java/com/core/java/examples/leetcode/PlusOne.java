package com.core.java.examples.leetcode;

public class PlusOne {

    public static void main(String[] args) {

        int [] digits = {1,2};
        for(Integer x : plusOne1(digits)){
            System.out.println(x);
        }
    }

    public static int[]  plusOne(int[] digits) {

        StringBuilder sb = new StringBuilder();
        for(Integer x : digits){
            sb.append(x);
        }
        long val = Long.parseLong(sb.toString())+1;
        String[] str1 = Long.toString(val).split("");
        int [] returnVal = new int[(str1.length)];
        for(int i=0;i<str1.length;i++){
            returnVal[i]= Integer.parseInt(str1[i]);
        }
        return returnVal;
    }

    public static int[]  plusOne1(int[] digits) {

       for(int i=digits.length-1 ;i>=0;i--){
           if(digits[i]<9){
               digits[i]++;
               return digits;
           }
           else if(digits.length == 1 && digits[i]==0){
               digits[i]=1;
               return digits;
           }
           digits[i]=0;
       }
       int [] result = new int[digits.length+1];
       result[0]=1;
       return result;
    }
}
