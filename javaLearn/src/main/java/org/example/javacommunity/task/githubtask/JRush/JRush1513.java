package org.example.javacommunity.task.githubtask.JRush;

import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.Scanner;

/*
Напиши программу, в которой пользователь вводит с клавиатуры путь к файлу или папке,
после чего в консоли выводится диск (корень для Unix-like),
на котором находится этот файл (или папка).
Для решения задачи используй Path и его методы.
 */
public class JRush1513 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Paths.get(str);
        Path unixPath = Path.of(path.toString().replace('\\', '/'));
        System.out.println(unixPath.getRoot());
    }
}
