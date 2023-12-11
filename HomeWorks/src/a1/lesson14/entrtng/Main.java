package a1.lesson14.entrtng;

import a1.lesson14.normal.task1.Circle;
import a1.lesson14.normal.task1.Rectangle;
import a1.lesson14.normal.task1.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Wellcome, player! Please enter your name: ");
        Player plr1 = new Player(scanner.nextLine());
        while (true) {
            System.out.println("""
                    1. Circle
                    2. Triangle
                    3. Rectangle
                    Choose the number of a shape to calculate the area or type 0 to exit:""");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            } else {
                switch (choice) {
                    default -> System.out.println ("404");
                    case 1 -> {
                        System.out.println("Enter radius: ");
                        Circle crc = new Circle(scanner.nextDouble());
                        plr1.earnPoints(crc);
                        }
                    case 2 -> {
                        System.out.println ("Enter the side: ");
                        double side = scanner.nextDouble();
                        System.out.println ("Enter the height: ");
                        double height = scanner.nextDouble();
                        Triangle trg = new Triangle(height, side);
                        plr1.earnPoints(trg);
                    }
                    case 3 -> {
                        System.out.println ("Enter the first side: ");
                        double a = scanner.nextDouble();
                        System.out.println ("Enter the second side: ");
                        double b = scanner.nextDouble();
                        Rectangle rct = new Rectangle(a, b);
                        plr1.earnPoints(rct);
                    }
                }
                plr1.getPlayer();
            }
        }
    }
}
