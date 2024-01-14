package prjcts.P4_Quizz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("q1", "correct", "wrong1", "wrong2", "wrong3", 1);
        Question q2 = new Question("question2", "correct", "wrong1", "wrong2", "wrong3", 2);
        Question q3 = new Question("question3", "correct", "wrong1", "wrong2", "wrong3", 3);



        Quiz qz = new Quiz(new Question[] {q1, q2, q3});

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Shall we begin? (Y or N): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("N")) {
            System.out.println ("Lol! bye coward! :D");
        } else {
            int next = 0;
            while (next < 3) {
                qz.getQuizQuestion(next);
                String playersAnswer = scanner.next();
                qz.winPoints(playersAnswer, next);
                next++;
            }
        }
        System.out.println ("GG WP ;)");
    }
}
