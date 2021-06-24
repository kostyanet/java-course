package ua.netrebenko.hw17;

import com.sun.istack.internal.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Obj[] objects = {
                new Obj(1, "First", 11),
                new Obj(2, "aSecond", 22),
                new Obj(3, "Third", 33),
                new Obj(4, "ForthA", 44)
        };

        Stream<Obj> stream = Arrays.stream(objects);

        System.out.println(runTask1(objects));
        System.out.println(runTask2(objects));
        System.out.println(runTask3(objects));
        System.out.println(runTask4(objects));
    }

    /**
     * Создать список, содержащий имена всех объектов.
     */
    private static List<String> runTask1(Obj[] objects) {
        return Arrays.stream(objects)
                .map(Obj::getName)
                .collect(Collectors.toList());
    }

    /**
     * Получить из списка объект с максимальным id
     */
    private static Obj runTask2(Obj[] objects) {
        return Arrays.stream(objects)
                .max(Obj::compareTo)
                .get();
    }

    /**
     * Посчитать сумму count всех объектов, у которых в name содержится символ ‘a’.
     */
    private static int runTask3(Obj[] objects) {
        return Arrays.stream(objects)
                .filter((o) -> o.getName().contains("a"))
                .mapToInt(Obj::getCount)
                .sum();
    }

    /**
     * Создать Map из списка, в котором ключом будет - id, а значением - name
     */
    private static Map<Integer, String> runTask4(Obj[] objects) {
        return Arrays.stream(objects)
                .collect(
                        Collectors.toMap(Obj::getId, Obj::getName)
                );
    }
}
