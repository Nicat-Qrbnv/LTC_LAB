package lesson17;

public class OneToTen implements Runnable{
    volatile int num = 0;

    public synchronized int increase () {
        return ++num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public void run() {

    }
}
