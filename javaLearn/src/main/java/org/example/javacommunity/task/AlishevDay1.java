package org.example.javacommunity.task;

import java.util.Scanner;

public class AlishevDay1 {
    static String str = "JAVA";

    public static void main(String[] args) {
        javaToStringUseFor();
        javaToStringUseWhile();
        olympiad();
        multiplicationTable();
    }

    private static void javaToStringUseFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(str + " ");
        }
    }

    private static void javaToStringUseWhile() {
        int count = 0;
        while (count <= 10) {
            System.out.println(str);
            count++;
        }
    }

    private static void olympiad() {
        for (int year = 1980; year <= 2020; ) {
            System.out.println("Олимпиада " + year + " года");
            year = year + 4;
        }
    }
    private static void multiplicationTable(){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        for (int i = 1; i <10 ; i++) {
            System.out.println(k*i);

        }
    }

}


