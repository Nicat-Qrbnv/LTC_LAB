package lesson16.task1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(3.0);
        c1.draw();
        System.out.println("The area is " + c1.calculateArea());
        System.out.println();
        Square s1 = new Square(6.0, 4.0);
        s1.draw();
        System.out.println("The area is " + s1.calculateArea());
    }
}
