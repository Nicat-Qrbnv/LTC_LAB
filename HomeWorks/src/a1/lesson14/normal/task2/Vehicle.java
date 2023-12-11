package a1.lesson14.normal.task2;

public class Vehicle {
    private final String color, type;

    public Vehicle(String color, String type) {
        this.color = color;
        this.type = type;
    }

    protected void start() {
        System.out.printf ("The engine of the %s %s has started!\n", color, type);
    }
}
