package ua.netrebenko.hw3;

public class Task2 {
    public static void main(String... args) {
         System.out.println("Words count: " + countWords(args));
    }

    private static int countWords(String... args) {
        short counter = 0;

        for (String word : args) {
            if (!hasDigit(word)) counter++;
        }
        return counter;
    }

    private static boolean hasDigit(String value) {
        return value.matches(".*\\d+.*");
    }
}
