package org.example.dmdevlesson.day3;

import java.util.Scanner;

public class D3L2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfTwo(sc.nextInt()));
    }
    public static int sumOfTwo(int value){
        int result = 0;
        while (value!=0){
            result+=value%10;
            value/=10;
        }
     return result;
    }
}
