package com.wt;

public class ArrayElementComparision {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 15, 20};
        int[] array2 = {3, 10, 20, 15};

        for (int i = 0; i < array1.length; i++) {
            String result = (array1[i] == array2[i]) ? "equal" 
                            : (array1[i] > array2[i]) ? "greater" 
                            : "lesser";
            System.out.println("Element " + (i + 1) + ": " + result);
        }
    }
}

