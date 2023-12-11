package a1.lesson13.task2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shape sh1 = new Shape();
        Circle c1 = new Circle(5.0);
        Rectangle r1 = new Rectangle(2.5, 5.0);
        Triangle t1 = new Triangle(3.4, 6.4);
        Square sq1 = new Square(4.7);
        sh1.getArea();
        System.out.println();
        c1.getArea();
        System.out.println();
        r1.getArea();
        System.out.println();
        t1.getArea();
        System.out.println();
        sq1.getArea();
    }
}
