package a1.lesson13.task2;

public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void getArea() {
        super.getArea();
        double area = this.height * this.base / 2.0;
        System.out.printf("The area of the %s is (height*base)/2 = %.2f\n", this.getClass().getSimpleName().toLowerCase(), area);
    }
}
