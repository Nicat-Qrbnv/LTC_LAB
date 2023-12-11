package a1.lesson14.normal.task1;

public class Main {
    public static void main(String[] args) {
        Circle crc = new Circle(1.23);
        Triangle trg = new Triangle(4.56, 7.89);
        Rectangle rct = new Rectangle(0.12, 3.45);

        System.out.printf (crc.getClass().getSimpleName() + " : %.2f\n", ShapeCalculator.calculateArea(crc));
        System.out.printf (trg.getClass().getSimpleName() + " : %.2f\n", ShapeCalculator.calculateArea(trg));
        System.out.printf (rct.getClass().getSimpleName() + " : %.2f\n", ShapeCalculator.calculateArea(rct));
    }
}
