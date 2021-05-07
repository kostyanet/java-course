package lesson02;

import java.util.Arrays;

public class Lesson02Task01 {
    public static void main(String[] args) {
        findTriangleArea(1.2, -4.4, 5.8, 3.9, -4.8, -0.1);
        findIsEven(3);
        findAbsoluteMinimalNumber(1.2, -4.4, 5.8, 3.9, -4.8, -0.1);
    }

    static void findTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * ((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3));
        System.out.println("Triangle area is " + area);
    }

    static void findIsEven(int x) {
        boolean isEven = x % 2 == 0;
        System.out.println("Given number " + x + " is even: " + isEven);
    }

    static void findAbsoluteMinimalNumber(double... args) {
        double[] absValues = Arrays.stream(args)
                .map(Lesson02Task01::getAbsoluteValue)
                .toArray();

        Arrays.sort(absValues);
        System.out.println("Absolute minimal number is " + absValues[0]);
    }

    static double getAbsoluteValue(double x) {
        return x >= 0 ? x : -x;
    }
}
