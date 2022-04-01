package com.core.java.examples.leetcode;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
    String s = "([]{})";
        System.out.println(isValid2(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> leftStack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c=='(' || c =='{' || c== '['){
                leftStack.push(c);
            }
            else if(c==')' && !leftStack.isEmpty() && leftStack.peek() =='('){
                leftStack.pop();
            }
            else if(c==']' && !leftStack.isEmpty() && leftStack.peek() =='['){
                leftStack.pop();
            }
            else if(c=='}' && !leftStack.isEmpty() && leftStack.peek() =='{'){
                leftStack.pop();
            }

        }

    return leftStack.isEmpty();
    }


    //  ([]{})
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
