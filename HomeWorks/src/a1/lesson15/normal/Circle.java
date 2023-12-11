package a1.lesson15.normal;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double... deltaRadius) {
        radius = radius + deltaRadius[0];
    }

    @Override
    public void calculateArea() {
        System.out.printf ("Area is: %.2f\n", 3.14 * radius * radius);
    }

}
