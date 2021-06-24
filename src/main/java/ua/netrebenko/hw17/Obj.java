package ua.netrebenko.hw17;

import lombok.Getter;

@Getter
public class Obj implements Comparable {
    private final int id;
    private  final String name;
    private final int count;

    public Obj(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    @Override
    public int compareTo(Object o) {
        Obj obj = (Obj) o;
        return this.id - obj.getId();
    }

    @Override
    public String toString() {
        return "Obj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
