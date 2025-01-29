package com.wt;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World"; 
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String str) {

        str = str.toLowerCase().replaceAll("\\s", "");

        int vowelCount = 0;
        int consonantCount = 0;

   
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
  
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++; 
                } else {
                    consonantCount++; 
                }
            }
        }

        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}

