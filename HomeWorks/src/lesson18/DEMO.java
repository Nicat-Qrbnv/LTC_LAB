package lesson18;

public class DEMO {

    static StringBuffer strBff = new StringBuffer("Buffer: ");

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

        Thread t1 = getThread("kar ", strBff);
        Thread t2 = getThread("kor ", strBff);
        Thread t3 = getThread("kürkü ", strBff);
        Thread t4 = getThread("yırtıq ", strBff);
        Thread t5 = getThread("kirpi.", strBff);

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

    public static Thread getThread (String s, StringBuffer sb) {
        Appending a = new Appending(s, sb);
        return new Thread(a);
    }
}
