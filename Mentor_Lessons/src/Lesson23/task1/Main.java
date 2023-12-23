package Lesson23.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter customer name: ");
        ShoppingCart c1 = new ShoppingCart(scanner.nextLine());

        while (true) {
            System.out.println ("Enter item: ");
            String item = scanner.next();

            System.out.println ("Enter price: ");
            double price = doubleParser();

            Product p = new Product(item, price);

            System.out.println ("Enter amount: ");
            double amount = doubleParser();

            c1.addItem(p, amount);

            System.out.println ("If you finished press Q or C to continue");
            if (scanner.next().equalsIgnoreCase("Q")) { break;}
        }

        System.out.println (c1);
    }

    private static double doubleParser () {

        double result;
        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            try {
                result = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println ("Enter correct double value: ");
            }
        } while (true);
        return result;
    }
}
