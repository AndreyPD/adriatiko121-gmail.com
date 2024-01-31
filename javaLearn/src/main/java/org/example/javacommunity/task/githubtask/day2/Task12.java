package org.example.javacommunity.task.githubtask.day2;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника
 * (2 целых числа). Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника:");
        int length = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        int width = scanner.nextInt();
        drawRectangle(length, width);
    }

    public static void drawRectangle(int length, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0 || i == width - 1) {
                    if (j == 0 || j == length - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("-");
                    }
                } else {
                    if (j == 0 || j == length - 1) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
