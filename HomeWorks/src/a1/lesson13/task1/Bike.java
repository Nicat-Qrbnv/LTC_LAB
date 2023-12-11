package a1.lesson13.task1;

public class Bike extends Vehicle{
    private int numOfWheels;
    private static int count;

    public Bike(String make, String model, int numOfWheels, int year) {
        super(make, model, year);
        this.numOfWheels = numOfWheels;
    }

    @Override
    public String toString() {
        String s = "";
        if (count == 0) {
            s += String.format("%s\n%-10s | %-10s | %-6s | %4s |\n", "_".repeat(41), "Make", "Model", "Wheels", "Year");
            count++;
        }
        s += String.format("%-10s | %-10s | %-6s | %4s |", make, model, numOfWheels, year);
        return s;
    }
}
