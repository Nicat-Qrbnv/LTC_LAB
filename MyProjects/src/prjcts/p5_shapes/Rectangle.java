package prjcts.p5_shapes;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    public void changeSides(double deltaWidth, double deltaLength) {
        width  += deltaWidth;
        length += deltaLength;
        width  = width  < 0 ? width  * (-1) : width;
        length = length < 0 ? length * (-1) : length;
    }

    @Override
    public void resize (double percent) {
        double p = 1 + percent/100;
        width *= p;
        length *= p;
    }
}
