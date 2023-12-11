package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap <String, Integer> examResults = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println ("Enter student (Press Q to quit): ");
            String student = scanner.next();
            if (student.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.println ("Enter the score: ");
            int score = scanner.nextInt();

            examResults.put(student, score);

        }

        printExamResults(examResults);

    }

    static void printExamResults (HashMap <String, Integer> er) {
        for (Map.Entry <String, Integer> entry : er.entrySet()) {
            System.out.println ("%-7s: %2d".formatted(entry.getKey(), entry.getValue()));
        }
    }
}
