package com.amfranks.datastructuresinjava.ch01_intro_to_dsa;

public class FindMaxSpaceComplexity {

    static int findMax(int[] arr) {
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        return maximum;
    }

    /*
     * The space complexity is N + 2 because N is the size
     * of the input array "arr" and two integers are also
     * used ("maximum" and "i"). The auxiliary space
     * complexity is 2, as it excludes input data.
     */
}
