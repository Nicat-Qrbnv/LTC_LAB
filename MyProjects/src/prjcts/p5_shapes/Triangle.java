package prjcts.p5_shapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double sp = getPerimeter() / 2; //Semi perimeter
        return Math.sqrt(sp * (sp-a) * (sp-b) * (sp-c));
    }

    public void changeSides(double dA, double dB, double dC) {
        a += dA;
        b += dB;
        c += dC;
        a = a < 0 ? a * (-1) : a;
        b = b < 0 ? b * (-1) : b;
        c = c < 0 ? c * (-1) : c;
    }

    @Override
    public void resize(double percent) {
        double p = 1 + percent/100;
        a *= p;
        b *= p;
        c *= p;
    }
}
