package com.core.java.examples.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {

        int n = 18;
        System.out.println( isHappy(n));

    }

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = sum(n);
        }
        return true;
    }

    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return sum;
    }
}
