package org.example.javacommunity.task.githubtask.day3;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
        System.out.println(factorialRecurs(sc.nextInt()));
    }
    public static int factorial(int a){
        int result=1;
        for (int i = 1; i <=a ; i++) {
            result = result * i;
        }return result;
    }
    public static long factorialRecurs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecurs(n - 1);
    }
}
