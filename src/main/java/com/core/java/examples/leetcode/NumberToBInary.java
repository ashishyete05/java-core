package com.core.java.examples.leetcode;

class NumberToBinary {

    public static void main(String[] args) {
        convertToBinary(10);
    }

    public static void convertToBinary(int num){
        int binary[] = new int[40];
        int index =0 ;

        while(num > 0){
            binary[index++]= num%2;
            num/=2;
        }
        for(int i=index-1;i>0;i--){
            System.out.println(binary[i]);
        }
    }
}
