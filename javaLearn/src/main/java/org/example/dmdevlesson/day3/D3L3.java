package org.example.dmdevlesson.day3;

import java.util.Scanner;

public class D3L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fibonacci(sc.nextInt());
    }
    public static void fibonacci(int lastValue){
        int first=0;
        int second=1;
        while (second<lastValue){
            System.out.println(second);
            int next = first+second;
            first=second;
            second=next;

        }
    }
}
