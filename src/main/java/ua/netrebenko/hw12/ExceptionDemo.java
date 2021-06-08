package ua.netrebenko.hw12;

/**
 * Examples of code which throw different types of exceptions.
 * Since all of the given examples deal with either unchecked exceptions (according to the chart
 * `exceptions.jpg`) or their subclasses, none of these cases assumes use of the `try-catch` statement.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        throwClassCastException();
        throwNullPointerException();
        throwNumberFormatException();
        throwArrayIndexOutOfBoundsException();
    }

    public static void throwClassCastException() {
        Object obj = new Integer(3);
        System.out.println(obj.toString());
    }

    public static void throwNullPointerException() {
        String x = null;
        if (x != null)
            System.out.println(x.charAt(1));
    }

    public static void throwNumberFormatException() {
        String x = "1.s2";
        try {
            System.out.println(Float.parseFloat(x));
        } catch (NumberFormatException e) {
            // ... do stuff
        }
    }

    public static void throwArrayIndexOutOfBoundsException() {
        int[] arr = {5, 7};
        int index = 33;

        if (index < arr.length)
            System.out.println(arr[33]);
    }
}
