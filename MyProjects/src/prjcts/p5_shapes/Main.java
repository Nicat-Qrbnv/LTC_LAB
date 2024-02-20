package prjcts.p5_shapes;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Rectangle r1 = new Rectangle(2, 5);
        Triangle t1 = new Triangle(6.4, 4, 4);
        System.out.println(c1.getArea());
        System.out.println(r1.getArea());
        System.out.println(t1.getArea());
    }
}
