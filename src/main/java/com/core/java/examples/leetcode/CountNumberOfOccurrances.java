package com.core.java.examples.leetcode;

class CountNumberOfOccurrences {
    public static void main(String[] args) {

        String input = "aaaabbccAAdd";
        char search = 'a';
        System.out.println("Java : " +count(input,search));
        System.out.println("Java-8 : " +countJava8(input,search));
        System.out.println("Java-Recursion : " +countRecursion(input,search,0));
    }

    public static int count(String input , char x){
        int counter =0;
        for(Character ch:input.toCharArray()){
            if(ch==x){
                counter++;
            }
        }
        return counter;
    }

    public static int countJava8(String input, char x){
        return (int)input.chars().filter(v->v==x).count();
    }

    public static int countRecursion(String str, char x, int index){

        if(index >= str.length())
            return 0;

        int count=0;

        if(str.charAt(index) == x)
            count++;

        return count + countRecursion(str,x,index+1);
    }


}
