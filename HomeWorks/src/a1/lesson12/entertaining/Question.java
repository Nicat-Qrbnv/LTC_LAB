package a1.lesson12.entertaining;

import java.util.Random;

public class Question {

    private String question;
    private String[] answers = new String[4];
    private int correctAnswer;
    private int point;

    //
    public Question(String question, String correctA, String wrongA1, String wrongA2, String wrongA3, int point) {
        this.question = question;
        answers[0] = correctA;
        answers[1] = wrongA1;
        answers[2] = wrongA2;
        answers[3] = wrongA3;
        this.point = point;
    }

    //
    public void getQuestion () {
        Random random = new Random();
        String[] tempA = new String[4];
        for(String a: answers) {
            int r;
            do {
                r = random.nextInt(4);
            } while (tempA [r] != null);
            tempA [r] = a;
            while (correctAnswer == 0) {
                correctAnswer = r;
            }
        }
        String s = String.format("""
                %s?
                A) %s
                B) %s
                C) %s
                D) %s""", question, tempA[0], tempA[1], tempA[2], tempA[3]);
        System.out.println (s);
    }

    public int checkAnswer(String a) {
        int answer;
        switch (a.toUpperCase()) {
            case "A" -> answer = 0;
            case "B" -> answer = 1;
            case "C" -> answer = 2;
            case "D" -> answer = 3;
            default -> answer = 4;
        }
        if (answer == correctAnswer) {
            return point;
        } else {
            return 0;
        }
    }
}
