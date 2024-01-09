package org.example.javacommunity.task;

import java.util.Scanner;

public class Task6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите фамилию:");
            String surname = scanner.nextLine();

            System.out.println("Введите имя:");
            String name = scanner.nextLine();

            System.out.println("Введите отчество:");
            String patronymic = scanner.nextLine();

            System.out.printf("Ваше ФИО: %s %s %s", surname, name, patronymic);
        }
}
