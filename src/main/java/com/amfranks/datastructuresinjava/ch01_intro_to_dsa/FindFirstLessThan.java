package com.amfranks.datastructuresinjava.ch01_intro_to_dsa;

public class FindFirstLessThan {

    static int findFirstLessThan(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < value) {
                return array[i];
            }
        }

        return value; // no lesser value found
    }

    /*
     * This algorithm's best case runtime would be if "value" were to be found
     * in array's first index. Its worst case runtime would be if "value" didn't
     * exist at all in array. In that case, "value" would be sequentially compared
     * against all indexes in the array.
     */
}
