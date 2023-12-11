package a1.lesson15.normal;

public class Square extends Shape {

    private double side1;
    private double side2;

    public Square(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void resize(double... deltaSide1Side2) {
        if (deltaSide1Side2.length > 1) {
            side1 = side1 + deltaSide1Side2[0];
            side2 = side2 + deltaSide1Side2[1];
        } else {
            side1 = side1 + deltaSide1Side2[0];
            side2 = side2 + deltaSide1Side2[0];
        }
    }

    @Override
    public void calculateArea() {
        System.out.printf ("Area is: %.2f\n", side1 * side2);
    }

}
