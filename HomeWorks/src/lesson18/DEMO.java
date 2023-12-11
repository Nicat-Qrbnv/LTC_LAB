package lesson18;

public class DEMO {

    static StringBuilder strBff = new StringBuilder("Buffer: ");

    public static void main(String[] args) throws InterruptedException {

        String str1 = "When you know about something";
        String str2 = " it stops being a nightmare.";
        String str3 = str1.concat(str2);
        String str4 = str3.substring(20, 29);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3.length());
        System.out.println();


        StringBuilder strBld = new StringBuilder("If I'm to choose between one evil and another, then I prefer not to choose at all.");
        strBld.append(" -- Geralt of Rivia");
        strBld.insert(0, "2023 ");
        System.out.println(strBld);
        System.out.println();

        Appending a1 = new Appending("kar ", strBff);
        Appending a2 = new Appending("kor ", strBff);
        Appending a3 = new Appending("kürkü ", strBff);
        Appending a4 = new Appending("yırtıq ", strBff);
        Appending a5 = new Appending("kirpi.", strBff);

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a2);
        Thread t3 = new Thread(a3);
        Thread t4 = new Thread(a4);
        Thread t5 = new Thread(a5);


        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();
        t5.join();

    }
}
