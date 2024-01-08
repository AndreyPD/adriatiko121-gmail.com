package org.example.javacommunity.task;

import java.util.Scanner;

public class AlishevDay2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        distributionOfTypeOfHouse(sc.nextInt());
        wthoutName(sc.nextInt(), sc.nextInt());
        formulaXY(sc.nextDouble());
    }


    public static void distributionOfTypeOfHouse(int value) {
        if (value <= 4 && value >= 1) {
            System.out.println("Малоэтажный дом");
        } else if (value <= 8 && value >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (value >= 9) {
            System.out.println("Многоэтажный дом");
        } else System.out.println("Ошибка, значение не может быть отрицательным");
    }

    public static void wthoutName(int first, int second) {
        if (first >= second) {
            System.out.println("Некорркетный ввод");
        } else for (; first < second; first++) {

            if (first % 5 == 0 && first % 10 != 0) {
                System.out.print(first + " ");
            }
        }
    }

    public static void formulaXY(double x) {
        double y= 0;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else y = 420;
        System.out.println(y);
    }
}
