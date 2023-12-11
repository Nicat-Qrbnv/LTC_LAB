package a1.lesson11.normal.e5_circle;

public class Circle {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }

    public double area () {
        return rad * rad * 3.14;
    }
}
