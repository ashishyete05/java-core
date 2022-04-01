package com.core.java.examples.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int current  = nums[i];
            if(hMap.containsKey(current) && i-hMap.get(current) <=k){
                return true;
            }else{
                hMap.put(current,i);
            }
        }
        return false;
    }
}
