package com.core.java.examples.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckPangram {

    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownooxjumpsoverthelazydog"));

    }
    public static boolean checkIfPangram(String sentence) {
        Set<Integer> hSet = new HashSet<>();
       for(int i=0;i<sentence.length();i++){
           hSet.add((int) sentence.charAt(i)-97);
       }
        return hSet.size()==26;
    }

}
