package org.example.javacommunity.task.githubtask.day1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        if ((num1 % 2 == 0) || (num2 % 3 == 0)) {
            System.out.println("Результат сравнения: " + (num1 > num2));
        }
        if ((num1 % 2 == 0) && (num1 % 3 == 0)) {
            if (Math.pow(num1, num2) > Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println("Результат: " + (int) Math.pow(num1, num2));
            }
        }
    }
}
