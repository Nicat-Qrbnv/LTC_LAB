package a1.lesson14.normal.task2;

public class Motorcycle extends Vehicle {

    public Motorcycle(String color, String type) {
        super(color, type);
    }

    @Override
    protected void start() {
        super.start();
        System.out.println ("Rider wore the helmet!");
    }
}
