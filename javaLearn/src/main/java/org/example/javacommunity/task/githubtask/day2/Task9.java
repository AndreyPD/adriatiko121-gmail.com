package org.example.javacommunity.task.githubtask.day2;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры.
 * Вывести на экран сумму каждого значения с предыдущим.
 * Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива
 */
public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Начальный массив: " + Arrays.toString(array));

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                result[i] = array[i] + array[array.length - 1];
            } else {
                result[i] = array[i] + array[i - 1];
            }
        }

        System.out.println("Конечный массив: " + Arrays.toString(result));
    }
}
