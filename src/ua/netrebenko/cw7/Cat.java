package ua.netrebenko.cw7;

public class Cat extends Animal {
    private final String pride;

    public Cat(String food, String location, String pride) {
        super(food, location);
        this.pride = pride;
    }

    void makeNoise() {
        System.out.println("Cat is making noise.");
    }

    void eat() {
        System.out.println("Cat of pride " + pride + " is eating");
    }
}
