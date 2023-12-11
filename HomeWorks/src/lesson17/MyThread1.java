package lesson17;

public class MyThread1 extends Thread{

    private final OneToTen ott;
    private String name;

    public MyThread1(OneToTen ott, String name) {
        this.ott = ott;
        this.name = name;
    }

    @Override
    public void run () {
        synchronized (ott) {
            while (ott.getNum() < 100) {

                    System.out.println(name + " : " + ott.increase());

                    try {
                        ott.notify();
                        ott.wait(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

            }
        }
    }
}
