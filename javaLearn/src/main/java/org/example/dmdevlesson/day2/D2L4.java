package org.example.dmdevlesson.day2;

import java.util.Scanner;

public class D2L4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный");
        } else
            System.out.println(year + " не високосный");

    }
}
