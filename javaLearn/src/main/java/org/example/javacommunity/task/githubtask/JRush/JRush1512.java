package org.example.javacommunity.task.githubtask.JRush;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/*
Задом наперед
*/

public class JRush1512 {
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());

        String result = outputStream.toString();
        String reversed = new StringBuilder(result).reverse().toString();
        System.out.println(reversed);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}