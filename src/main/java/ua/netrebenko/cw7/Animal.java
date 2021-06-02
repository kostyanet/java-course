package ua.netrebenko.cw7;

public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    void makeNoise() {
        System.out.println("Animal is making noise.");
    }

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }

    String getDescription() {
        return getClass() +
                "{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
