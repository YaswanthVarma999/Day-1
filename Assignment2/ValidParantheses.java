package com.wt;

import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println(isValid(input));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty() && 
                       ((c == ')' && stack.peek() == '(') || 
                        (c == '}' && stack.peek() == '{') || 
                        (c == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
