package lesson17.task1;

public class Student {

    private final String studentNumber;
    private final int score;

    public Student(String studentNumber, int score) {
        this.studentNumber = studentNumber;
        this.score = score;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "[ " + studentNumber + " : " + score + " ]";
    }
}
