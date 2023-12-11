package a1.lesson15.normal;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(3.091);
        Circle c2 = new Circle(6.182);

        Square s1 = new Square (4, 5);
        Square s2 = new Square (8, 10);

        c1.calculateArea();
        c2.calculateArea();
        System.out.println();
        s1.calculateArea();
        s2.calculateArea();
        System.out.println();

        c1.resize(2);
        c2.resize(0.5);

        s1.resize(-25, 25);
        s2.resize(25, -25);

        c1.calculateArea();
        c2.calculateArea();
        System.out.println();
        s1.calculateArea();
        s2.calculateArea();
    }
}
