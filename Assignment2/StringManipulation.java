package com.wt;
public class StringManipulation {
    public static void main(String[] args) {
        String input = "Hello World!"; 

        input = input.toLowerCase();

        String processed = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar >= 'a' && currentChar <= 'z') {

                if (processed.indexOf(String.valueOf(currentChar)) == -1) {

                    processed+=currentChar;

                    int frequency = countOccurrences(input, currentChar);
                    
                    System.out.println(currentChar + ": " + frequency);
                }
            }
        }
    }

    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
