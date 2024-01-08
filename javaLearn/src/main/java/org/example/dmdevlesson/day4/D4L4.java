package org.example.dmdevlesson.day4;

import java.util.Arrays;

public class D4L4 {
        public static void main(String[] args) {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[] linearized = linearize(arr);
            System.out.println(Arrays.toString(linearized));
        }

        public static int[] linearize(int[][] arr) {
            int totalSize = 0;
            for (int i = 0; i < arr.length; i++) {
                totalSize += arr[i].length;
            }

            int[] linearized = new int[totalSize];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    linearized[index] = arr[i][j];
                    index++;
                }
            }

            return linearized;
        }
    }