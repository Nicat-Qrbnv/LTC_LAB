package a1.lesson14.normal.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Type in the operation to realize or press Q to exit: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            } else {
                MathOperations.inputConverter(input);
            }
        } while (true);

    }

}
