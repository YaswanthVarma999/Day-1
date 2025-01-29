package com.wt;

import java.util.Scanner;

public class SubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxSum = findMaxSubarraySum(array);

        System.out.println("The maximum sum of a contiguous subarray is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] array) {
        int currentMax = array[0];
        int globalMax = array[0];

        for (int i = 1; i < array.length; i++) {

            currentMax = (array[i] > currentMax + array[i]) ? array[i] : currentMax + array[i];

            globalMax = (currentMax > globalMax) ? currentMax : globalMax;
        }

        return globalMax;
    }
}
