package org.example.javacommunity.task;

import java.util.Scanner;

public class Task3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        var a=sc.nextInt();
        var b=sc.nextInt();
        double c;
        System.out.println(c = b*a*(a + b)/(Math.pow(a,2)));
        comparison();
    }
    public static void comparison(){
        System.out.println("Введите число a:");
        int a = sc.nextInt();

        System.out.println("Введите число b:");
        int b = sc.nextInt();

        int a3 = a * a * a;
        int b2 = b * b;

        boolean result = a3 > b2;

        System.out.println("a^3 > b^2: " + result);
    }

}
