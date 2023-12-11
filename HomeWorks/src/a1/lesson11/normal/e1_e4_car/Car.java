package a1.lesson11.normal.e1_e4_car;

public class Car {
    private String make;
    private String model;
    private static int count = 0;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void getCar () {
        count++;
        switch (count) {
            case 1 -> System.out.println (count + "st car: " + model + " made by " + make);
            case 2 -> System.out.println (count + "nd car: " + model + " made by " + make);
            case 3 -> System.out.println (count + "rd car: " + model + " made by " + make);
            default -> System.out.println (count + "th car: " + model + " made by " + make);
        }
    }

}
