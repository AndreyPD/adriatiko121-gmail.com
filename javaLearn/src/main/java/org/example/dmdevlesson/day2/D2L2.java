package org.example.dmdevlesson.day2;

import java.util.Scanner;

public class D2L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countThree = sc.nextInt();
        if (countThree % 10 == 3) {
            System.out.println("Число имеет в окончании 3");
        } else System.out.println("Число не имеет в окончании 3");
    }
}
