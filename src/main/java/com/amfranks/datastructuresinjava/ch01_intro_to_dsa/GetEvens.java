package com.amfranks.datastructuresinjava.ch01_intro_to_dsa;

import java.util.ArrayList;

public class GetEvens {

    ArrayList<Integer> getEvens(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        return evenNumbers;
    }

    /*
     * In the worst case, all items from the input are added to the returned
     * ArrayList. As the input size N increases, the output size increases to match.
     * Therefore, the worst case auxiliary space complexity of getEvens() is S(N) = N + k.
     *
     * In the best case, the input contains only odd numbers and the output size is 0
     * whether the input had 10 odd numbers or 1,000 odd numbers. A constant output size
     * of zero corresponds to an auxiliary space complexity of k, which represents space
     * complexity not including the input data. This would be represented as S(N) = k.
     */
}
