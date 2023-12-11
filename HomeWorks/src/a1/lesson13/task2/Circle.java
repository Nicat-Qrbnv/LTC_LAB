package a1.lesson13.task2;

public class Circle extends Shape {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public void getArea() {
        super.getArea();
        double area = Math.PI * this.rad * this.rad;
        System.out.printf("Area of Circle is π*(radius)^2 = %.2f\n", area);
    }
}
