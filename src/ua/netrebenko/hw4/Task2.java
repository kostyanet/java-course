package ua.netrebenko.hw4;

public class Task2 extends RandIntegers {
    public static void main(String[] args) {
        int[] numbers = getIntArray(1000);
        System.out.println("Array contains " + getPrimeCount(numbers) + " prime numbers.");
    }

    public static short getPrimeCount(int[] numbers) {
        short count = 0;

        for (int x : numbers) {
            if (isPrime(x)) count++;
        }

        return count;
    }
}
