package org.example.dmdevlesson.day2;

import java.util.Scanner;

public class D2L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month == 12 || month == 1 || month == 2)
            System.out.println("это " + month + " месяц зимы");
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("это " + month + " месяц весны");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("это " + month + " месяц лета");
        }
        if (month == 9 || month == 10 || month == 11) {
            System.out.println("это " + month + " месяц осени");
        }

    }
}
