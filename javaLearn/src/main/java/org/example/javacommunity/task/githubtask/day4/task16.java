package org.example.javacommunity.task.githubtask.day4;

public class task16 {
    private String name;
    private int count;

    public task16(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public task16(String name) {
        this(name, 0);
    }

    public int increment() {
        return ++count;
    }

    public int decrement() {
        return --count;
    }

    public int incrementBy(int value) {
        return count += value;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        task16 oddCounter = new task16("Нечетные числа");
        task16 evenCounter = new task16("Четные числа");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenCounter.increment();
            } else {
                oddCounter.increment();
            }
        }

        System.out.println(oddCounter.getName() + ": " + oddCounter.getCount());
        System.out.println(evenCounter.getName() + ": " + evenCounter.getCount());
    }
}