package prjcts.p5_shapes;

public class Circle extends Shape {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*rad; //Formula: 2 * π * R
    }

    public double getArea() {
        return 3.14 * rad * rad; //Formula: π * R²
    }

    @Override
    public void resize (double percent) {

        rad *= (1 + percent/100);

    }
}
