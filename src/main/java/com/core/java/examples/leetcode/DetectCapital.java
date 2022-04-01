package com.core.java.examples.leetcode;

import java.util.function.Predicate;

public class DetectCapital {
    public static void main(String[] args) {

        System.out.println(detectCapital("AshiSh"));

    }
    public static boolean detectCapitalUse(String word) {

        boolean allUpper = true;
        boolean allLower = true;
        boolean flg = true;
        int counter =0;
        if(Character.isUpperCase(word.charAt(0))){
            for(Character ch: word.toCharArray()){
                if(!Character.isUpperCase(ch)){
                    allUpper=false;
                }else if(!Character.isLowerCase(ch) && counter>0){
                    allLower =false;
                }
                if(!allLower&&!allUpper){
                    flg=false;
                    break;
                }
                counter++;
            }
        }else if(Character.isLowerCase(word.charAt(0))){
            for(Character ch: word.toCharArray()){
                if(!Character.isLowerCase(ch)){
                    allLower =false;
                }
                if(!allLower){
                    flg=false;
                    break;
                }
            }
        }
        return flg;
    }

    public static boolean detectCapitalUse1(String str){
        boolean flg = true;
            if(Character.isUpperCase(str.charAt(0))&&str.length()>1){
                if(Character.isUpperCase(str.charAt(1))&&str.length()>2){
                    for(int i=2;i<str.length(); i++){
                        if(!Character.isUpperCase(str.charAt(i))) {
                           flg = false;
                            break;
                        }
                    }
                } else if(Character.isLowerCase(str.charAt(1))&&str.length()>2){
                    for(int i=2;i<str.length(); i++){
                        if(!Character.isLowerCase(str.charAt(i))) {
                            flg = false;
                            break;
                        }
                    }
                }
                }else if(Character.isLowerCase(str.charAt(0))&&str.length()>1){
                for(int i=1;i<str.length(); i++){
                    if(!Character.isLowerCase(str.charAt(i))) {
                        flg = false;
                        break;
                    }
                }
            }
            return flg;
            }


            public static boolean detectCapital(String word){

            if(word.length()<=1)return true;
            Predicate<Character> corectCase = Character::isLowerCase;
            if(Character.isUpperCase(word.charAt(0)) &&
                    Character.isUpperCase(word.charAt(1))){
                corectCase = Character::isUpperCase;
                }


            for(int i=1;i<word.length();i++){
                if(!corectCase.test(word.charAt(i)))
                    return false;
            }
                return true;
            }
    }

