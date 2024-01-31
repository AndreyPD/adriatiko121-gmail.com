package org.example.javacommunity.task.githubtask.day1;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        changeBandA(a, b);
        changeAandB(a, b);
    }

    public static void changeBandA(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }

    public static void changeAandB(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}

