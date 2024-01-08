package org.example.dmdevlesson.day4;

import java.util.Arrays;

public class D4L2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }

    public static int[] removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = 0;
                    }
                }
            }
        }
        return array;
    }
}
