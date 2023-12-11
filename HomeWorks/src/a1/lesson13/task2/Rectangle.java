package a1.lesson13.task2;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public final void getArea() {
        super.getArea();
        double area = this.width * this.length;
        System.out.printf("The area of the %s is width*length = %.2f\n", this.getClass().getSimpleName().toLowerCase(), area);
    }
}
