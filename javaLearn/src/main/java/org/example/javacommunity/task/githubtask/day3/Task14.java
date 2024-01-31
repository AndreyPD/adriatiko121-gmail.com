package org.example.javacommunity.task.githubtask.day3;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0f, 2.0f));
        System.out.println(sum(1.0, 2.0));
        System.out.println(sum('a', 'b'));
        System.out.println(sum((byte) 1, (byte) 2));
        System.out.println(sum((short) 1, (short) 2));
        System.out.println(sum(1L, 2L));
        System.out.println(sum(true, false));
        System.out.println(sum("Hello", "World"));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(char a, char b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    public static byte sum(byte a, byte b) {
        byte result = (byte) (a + b);
        if (result - a != b) {
            System.out.println("Warning: Possible loss of data!");
        }
        return result;
    }

    public static short sum(short a, short b) {
        short result = (short) (a + b);
        if (result - a != b) {
            System.out.println("Warning: Possible loss of data!");
        }
        return result;
    }

    public static long sum(long a, long b) {
        return a + b;
    }

    public static boolean sum(boolean a, boolean b) {
        return a && b;
    }

    public static String sum(String a, String b) {
        return a + b;
    }
}
