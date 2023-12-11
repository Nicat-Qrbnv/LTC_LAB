package lesson17.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private static int[] scores = new int[0];
    private static Student[] students = new Student[0];

    private static double getMedian (int[] scrs) {

        Arrays.sort(scrs);
        double median;
        if ((scrs.length % 2) != 0) {
            median = scrs[scrs.length/2];
        } else {
            double temp = ( scrs[(scrs.length/2)-1] + scrs[(scrs.length/2)] ) / 2.0;
            median = Math.round(temp*100)/100.0;
        }
        return median;
    }

    private static double getMean (int[] scrs) {
        Arrays.sort(scrs);
        double temp = 0;

        for (int s : scrs) {
            temp += s;
        }

        temp /= scrs.length;
        return Math.round(temp*100)/100.0;
    }

    public static void exe() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println ("Enter student number and score (Ex: S12345, 99). " +
                                "\nPress \"C\" to finish and calculate mean and median scores: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("c")) {
                break;

            } else {

                String[] temp = input.replaceAll(" ", "").split(",");

                try {

                    Student t = Calculator.assignData(temp);
                    students = Arrays.copyOf(students, students.length +1);
                    if (t.getStudentNumber() != null) {
                        students[students.length - 1] = t;
                    }

                } catch (InvalidInputException | InvalidStudentNumberException | NumberFormatException | InvalidScoreException e) {
                    System.out.println (e.getMessage());
                }

            }

        }

        if (scores.length > 0) {
            for (Student s : students) {
                System.out.println(s);
            }
            System.out.println();
            System.out.println("Mean score: " + getMean(scores));
            System.out.println("Median score: " + getMedian(scores));
        }

        scanner.close();

    }

    private static Student assignData (String[] s) throws InvalidStudentNumberException, InvalidScoreException, NumberFormatException, InvalidInputException {

        String number = "default";
        int score = 0;
        if (s.length == 2) {

            if (s[0].charAt(0) == 'S' || s[0].charAt(0) == 's' ) {
                number = s[0].toUpperCase();
            } else {
                throw new InvalidStudentNumberException("Invalid student number!");
            }

            try {
                int t = Integer.parseInt(s[1]);

                if (t >= 0 && t <= 100) {
                    score = t;
                    scores = Arrays.copyOf(scores, scores.length+1);
                    scores[scores.length-1] = t;
                } else {
                    throw new InvalidScoreException ("Invalid score!");
                }

            } catch (NumberFormatException e) {
                throw new NumberFormatException("Invalid score!");
            }

        } else {
            throw new InvalidInputException("Invalid input!");
        }
        return new Student(number, score);

    }


}
