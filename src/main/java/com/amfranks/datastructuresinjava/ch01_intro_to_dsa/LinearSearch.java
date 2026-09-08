package com.amfranks.datastructuresinjava.ch01_intro_to_dsa;

public class LinearSearch {

    static int linearSearch(int[] numbers, int key) {

        // Iterate through numbers array to find key
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 23, 21};
        int key = 23;

        System.out.println(key + " is found at index: " + linearSearch(numbers, key));
    }
}
