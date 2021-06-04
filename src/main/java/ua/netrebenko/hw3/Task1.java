package ua.netrebenko.hw3;

public class Task1 {
    public static void main(String... args) {
        String nonSpaced = removeSpaces(String.join(" ", args));
        System.out.println("Without spaces: " + nonSpaced);
        System.out.println("Is palindrome: " + isPalindrome(nonSpaced));
    }

    static String removeSpaces(String input) {
        return input.replaceAll("\\s+", "");
    }

    static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();

        return reversed.toLowerCase()
                .equals(input.toLowerCase());
    }
}
