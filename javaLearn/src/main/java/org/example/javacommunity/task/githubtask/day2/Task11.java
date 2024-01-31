package org.example.javacommunity.task.githubtask.day2;

import java.util.Scanner;

/**
 * Декомпозировать задачу Task5
 * Вынести в отдельный метод использование switch-case. Также вынести в отдельный метод использование  System.out.println
 */
public class Task11 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    courtesy(sc.nextLine());
    }

    public static void courtesy(String str) {

        switch (str) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Good bye");
            case "How are you" -> System.out.println("How are your doing");
            case null, default -> System.out.println("Unknown message");
        }
    }
}
