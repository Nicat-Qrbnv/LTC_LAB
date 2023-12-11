package a1.lesson13.task1;

public class Vehicle {

    protected String make, model;
    protected int year;

    // public
    // private
    // default
    // protected

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
