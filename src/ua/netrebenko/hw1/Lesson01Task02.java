package ua.netrebenko.hw1;

public class Lesson01Task02 {
    public static void main(String[] args) {
        runMethod1(args[0]);
        runMethod2(args[0]);
    }

    static void runMethod1(String input) {
        String result = "";
        char[] chars = input.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }

        System.out.println("First method returns: " + result);
    }

    static void runMethod2(String input) {
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        System.out.println("Second method returns: " + result);
    }
}
