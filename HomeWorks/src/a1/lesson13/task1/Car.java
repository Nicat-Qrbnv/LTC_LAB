package a1.lesson13.task1;

public class Car extends Vehicle{
    private int numOfDoors;
    private static int count = 0;

    public Car(String make, String model, int numOfDoors, int year) {
        super(make, model, year);
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        String s = "";
        if (count == 0) {
            s += String.format("%s\n%-10s | %-10s | %-6s | %4s |\n", "_".repeat(41), "Make", "Model", "Doors", "Year");
            count++;
        }
        s += String.format("%-10s | %-10s | %-6s | %4s |", make, model, numOfDoors, year);
        return s;
    }
}
