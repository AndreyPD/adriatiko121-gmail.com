package org.example.javacommunity.task.githubtask.day1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Числа равны!");
        } else if (num1 % 2 == 0) {
            int product = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + product);
        } else {
            int quotient = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }
    }
}
