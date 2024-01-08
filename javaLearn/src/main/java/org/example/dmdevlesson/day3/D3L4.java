package org.example.dmdevlesson.day3;

import java.util.Scanner;

public class D3L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество дней");
    int days = sc.nextInt();
        printStatistics(days);

    }
    private static void printStatistics(int days) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < days; i++) {
            System.out.println("Введите величину осадко для дня " + (i + 1));
            int value = scanner.nextInt();
            sum += value;
            if (maxValue < value) {
                maxValue = value;
            }
        }
        System.out.println("Количество дней: " + days);
        System.out.println("Количество осадков за все время : " + sum);
        System.out.println("Среднее количество осадков: " + ((double) sum / days));
        System.out.println("Максимальные осадки за период : " + maxValue);
    }
}
