package ua.netrebenko.hw4;

public class Task3 extends RandIntegers {
    public static void main(String[] args) {
        int[] numbers = getIntArray(1000);
        System.out.println("Array contains " + getCompositeCount(numbers) + " composite numbers.");
    }

    public static short getCompositeCount(int[] numbers) {
        short count = 0;

        for (int x : numbers) {
            if (!isPrime(x)) count++;
        }

        return count;
    }
}
