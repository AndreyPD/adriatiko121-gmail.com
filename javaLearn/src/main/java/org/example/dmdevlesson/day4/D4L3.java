package org.example.dmdevlesson.day4;

import java.util.Arrays;

public class D4L3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};

        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        int med= mergedArray.length/2;
        for (int j =0; j < arr2.length; j++) {
            mergedArray[med] = arr2[j];
            med++;
        }


        return mergedArray;
    }
}