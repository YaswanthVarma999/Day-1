package com.wt;
import java.io.PrintStream;
import java.util.Arrays;
class AnagramChecker {

     boolean areAnagrams(String s1, String s2) {
       
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";
       AnagramChecker a= new AnagramChecker();
		System.out.println(a.areAnagrams(s1, s2));
    }
}
