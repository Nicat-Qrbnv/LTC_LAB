package lesson17;

public class Main {
    public static void main(String[] args) {

        OneToTen ott = new OneToTen();
        MyThread1 t1 = new MyThread1(ott, "Odd ");
        MyThread1 t2 = new MyThread1(ott, "Even");

        t1.start();
        t2.start();
    }
}
