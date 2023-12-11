package a1.lesson12.entertaining;

public class Quiz {

    private Question[] questions;
    private int playersAnswer;
    private int playersPoints;

    public Quiz(Question[] questions) {
        this.questions = questions;
    }

    public void winPoints (String playersAnswer, int question) {
        int p = questions[question].checkAnswer(playersAnswer);
        if (p == 0) {
            System.out.println (playersAnswer.toUpperCase() + " is wrong answer! \nYour current points: " + playersPoints);
        } else {
            System.out.println (playersAnswer.toUpperCase() + " is correct answer! You earned " + p + " points. \n Your current points: " + (playersPoints + p));
            playersPoints += p;
        }
    }

    public void getQuizQuestion (int q) {
        questions[q].getQuestion();
    }
}
