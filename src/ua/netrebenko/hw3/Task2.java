package ua.netrebenko.hw3;

public class Task2 {
    public static void main(String... args) {
         System.out.println("Words count: " + countWords(args));
    }

    private static int countWords(String... args) {
        return args.length;
    }
}
