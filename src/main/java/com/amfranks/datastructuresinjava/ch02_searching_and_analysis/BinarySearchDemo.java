package com.amfranks.datastructuresinjava.ch02_searching_and_analysis;

import java.util.Scanner;

public class BinarySearchDemo {

    static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {

            // Calculate middle index of array
            int mid = (high + low) / 2;

            if (numbers[mid] < key) {
                low = mid + 1;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                return mid; // key is found
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMBERS: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println("\nEnter a value: ");
        int key = scanner.nextInt();

        int keyIndex = binarySearch(numbers, key);

        if (keyIndex == -1) {
            System.out.println(key + " was not found.");
        } else {
            System.out.println("Found " + key + " at index " + keyIndex + ".");
        }
    }
}
