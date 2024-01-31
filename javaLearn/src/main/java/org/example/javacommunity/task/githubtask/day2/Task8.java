package org.example.javacommunity.task.githubtask.day2;

/**
 * Tasks from GitHub: roadmap arrays
 * Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
 * Вариант 1: не используя переменную типа String;
 * Вариант 2: предварительно собрав значения массива в переменную типа String.
 * Подсказка для варианта 2: создать пустую строку можно так: String s = “”;
 */

public class Task8 {
    public static void main(String[] args) {
        char[] nameArray = {'A', 'n', 'd', 'r', 'e', 'y'};
        System.out.println(nameArray);//?????
        String name = new String(nameArray);
        System.out.println(name);
    }

}
