package com.core.java.examples.leetcode;

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("abcd",2));

    }

    public static String removeDuplicates(String s, int k) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int counter =0;
        boolean dupAdj = false;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i+1)){
                sb1.append(s.charAt(i));
                counter++;
                if(counter==k){
                    sb1=new StringBuilder();
                }else{
                    sb.append(sb1);
                }
            }else{
                sb.append(String.valueOf(s.charAt(i)));
            }
            counter=0;
        }
        return sb.toString();
    }
}
