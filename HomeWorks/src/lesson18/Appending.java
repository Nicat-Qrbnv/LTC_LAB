package lesson18;

import static lesson18.DEMO.strBff;

public class Appending implements Runnable {

    private final StringBuilder lock;
    private String str;
    public Appending(String str, StringBuilder lock) {
        this.str = str;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            strBff.append(str);
            System.out.println (strBff);

            try {
                Thread.sleep(250);
                lock.notify();
                lock.wait(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
