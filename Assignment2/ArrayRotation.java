package com.wt;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of times to rotate the array: ");
        int n = scanner.nextInt();

        System.out.print("Enter direction of rotation (left/right): ");
        String direction = scanner.next().toLowerCase();

        n = n % size;

        if (direction.equals("right")) {
            rotateRight(array, n);
        } else if (direction.equals("left")) {
            rotateLeft(array, n);
        } else {
            System.out.println("Invalid direction entered. Please use 'left' or 'right'.");
            return;
        }

        System.out.println("Rotated array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void rotateRight(int[] array, int n) {
        reverse(array, 0, array.length - 1);
        reverse(array, 0, n - 1);
        reverse(array, n, array.length - 1);
    }

    public static void rotateLeft(int[] array, int n) {
        reverse(array, 0, n - 1);
        reverse(array, n, array.length - 1);
        reverse(array, 0, array.length - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
