package com.wt;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama"; // Sample input string

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("\\s", "").toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false; 
            }
        }

        
        return true;
    }
}
