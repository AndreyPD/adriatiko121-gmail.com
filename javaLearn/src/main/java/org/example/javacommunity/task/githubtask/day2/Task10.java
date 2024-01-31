package org.example.javacommunity.task.githubtask.day2;

import java.util.Arrays;

/**
 * Вычислить и записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        int count = 0;
        int num = 2;

        while (count < 10) {
            if (isPrime(num)) {
                primeNumbers[count] = num;
                count++;
            }
            num++;
        }

        System.out.println(Arrays.toString(primeNumbers));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
