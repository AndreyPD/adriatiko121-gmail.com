package org.example.javacommunity.task.githubtask.day3;


public class Task13 {
    public static void main(String[] args) {
        System.out.println(stringConnector("Hello","my","name","is","Andrey"));
    }

    public static String stringConnector(String... str) {
        String result = "";
        for (String s : str) {
            result += s + " ";
        }
        return result.trim();
    }

}
