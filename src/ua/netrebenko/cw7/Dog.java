package ua.netrebenko.cw7;

public class Dog extends Animal {
    private final String name;

    public Dog(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    void makeNoise() {
        System.out.println("Dog " + name + " is barking.");
    }

    void eat() {
        System.out.println("Dog is eating.");
    }
}
