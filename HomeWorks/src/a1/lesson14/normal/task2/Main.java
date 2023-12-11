package a1.lesson14.normal.task2;

class Main {
    public static void main(String[] args) {
        Vehicle grnCar = new Car ("green", "sedan");
        Vehicle bluMotor = new Motorcycle("blue", "ATV");

        System.out.println();
        grnCar.start();
        System.out.println();
        bluMotor.start();
    }
}
