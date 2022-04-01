package com.core.java.examples.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println("Result : "+containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> sSet = new HashSet<>();
        for(Integer num : nums){
            if(!sSet.contains(num)){
                sSet.add(num);
            }else{
                return true;
            }
        }
        return false;
    }
}
