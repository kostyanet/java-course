package ua.netrebenko.hw15;

public class User implements Comparable<User> {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user " + name;
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}
