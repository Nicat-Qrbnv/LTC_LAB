package lesson17;

public class OneToTen extends Thread{
    volatile int num = 0;

    public synchronized int increase () {
        return ++num;
    }

    public int getNum() {
        return num;
    }
}
