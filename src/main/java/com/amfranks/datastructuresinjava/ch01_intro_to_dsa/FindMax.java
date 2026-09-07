package com.amfranks.datastructuresinjava.ch01_intro_to_dsa;

public class FindMax {

    static int findMax(int[] inputArray) {
        int max = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 46, 73, 12};

        int maxEl = findMax(arr);

        System.out.println(maxEl);
    }
}