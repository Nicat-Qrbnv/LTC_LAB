package a1.lesson14.normal.task2;

public class Car extends Vehicle {

    public Car(String color, String type) {
        super(color, type);
    }

    @Override
    protected void start() {
        super.start();
        System.out.println ("Driver fastened the belt!");
    }
}
