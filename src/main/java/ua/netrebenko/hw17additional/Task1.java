package ua.netrebenko.hw17additional;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Дан массив double[]. Найти максимальное число, минимальное число, среднее арифметическое и сумму.
 * (рекомендация - создайте только один стрим для решения задачи)
 */
public class Task1 {
    public static void main(String[] args) {
        double[] arr = {1.0, 2.5, 3.4, -0.8};
        Supplier<Stream<Double>> streamSupplier = () -> Arrays.stream(arr).boxed();

        streamSupplier.get().max(Double::compareTo).ifPresent(System.out::println);
        streamSupplier.get().min(Double::compareTo).ifPresent(System.out::println);

        System.out.println(
                streamSupplier
                        .get()
                        .mapToDouble(Double::doubleValue)
                        .sum()
        );

        streamSupplier
                .get()
                .mapToDouble(Double::doubleValue)
                .average()
                .ifPresent(System.out::println);
    }
}
