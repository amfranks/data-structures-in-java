package com.amfranks.datastructuresinjava.ch02_searching_and_analysis;

import java.util.Scanner;

public class LinearSearchDemo {

    /*
     * In the worst case, linear search compares the search key against all array elements.
     * In the best case, linear search compares the search key against the array's first
     * element. If comparing an array element against the search key is a constant time
     * operation, then linear search's worst case complexity is O(N) and the best case
     * is O(1).
     */

    static int linearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 7, 10, 11, 32, 45, 87};
        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMBERS: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nEnter a value: ");
        int key = scanner.nextInt();

        int keyIndex = linearSearch(numbers, key);

        if (keyIndex == -1) {
            System.out.println("\n" + key + " was not found.");
        } else {
            System.out.println("\nFound " + key + " at index " + keyIndex + ".");
        }
    }
}
