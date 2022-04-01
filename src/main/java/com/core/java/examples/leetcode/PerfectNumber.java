package com.core.java.examples.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int num){
        boolean isPerfect = false;
        int total =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                total+=i;
            }

            if(total==num){
                isPerfect=true;
            }
        }
        return isPerfect;
    }
}
