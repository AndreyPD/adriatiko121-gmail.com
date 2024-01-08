package org.example.dmdevlesson.day3;

import java.util.Scanner;

public class D3L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Факториал вычисленный через цикл = "+factorial(sc.nextInt()));
        System.out.println("Факториал вычисленный через рекурсию = "+factorialRecurs(sc.nextInt()));
    }

    public static Object factorial(int value) {
        int factorial = 1;
        for (int i = 1; i <= value; i++) {
        factorial*=i;
        }
        return factorial;
    }
    public static int factorialRecurs(int value) {
        if (value==1){
            return 1;
        }
        return value * factorialRecurs(value-1);
    }
}
