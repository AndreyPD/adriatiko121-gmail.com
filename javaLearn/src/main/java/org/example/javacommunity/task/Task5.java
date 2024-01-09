package org.example.javacommunity.task;

import java.util.Scanner;

public class Task5 {
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("Введите строку:");
            String input = sc.nextLine();

            switch (input) {
                case "Hi" -> System.out.println("Hello");
                case "Bye" -> System.out.println("Good bye");
                case "How are you" -> System.out.println("How are your doing");
                case null, default -> System.out.println("Unknown message");
            }
        }
}
