package org.example.dmdevlesson.day2;

import java.util.Scanner;

public class D2L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rubles = sc.nextInt();
        String str1 = " рубль";
        String str3 = " рублей";
        String str4 = " рубля";

        if (rubles % 10 == 1 && rubles % 100 != 11) {
            System.out.println(rubles + str1);
        } else if (rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4) {
            System.out.println(rubles + str4);
        } else System.out.println(rubles + str3);
    }

}
