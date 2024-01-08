package org.example.dmdevlesson.day4;

import java.util.Arrays;
import java.util.Random;

public class D4L1 {
   public static Random random = new Random();
    public static void main(String[] args) {
        int [] array = new int[random.nextInt(10,11)];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(shiftArray(array)));
    }
    public static int[] fillArray (int[] array ){
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(1,20);
        }
        return array;
    }
    public static int[] shiftArray(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
        return array;
    }

}
