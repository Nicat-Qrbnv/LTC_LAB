package a1.lesson11.normal.e3_stringDemo;

import java.util.Scanner;

public class StrDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter name: ");
        String name = scanner.nextLine();
        String nameUpperCase = name.substring(0,1).toUpperCase().concat(name.substring(1));
        System.out.println ("Enter surname: ");
        String srname = scanner.nextLine();
        String srnameUpperCase = srname.substring(0,1).toUpperCase().concat(srname.substring(1));
        System.out.println ("Hi " + nameUpperCase + " " + srnameUpperCase + "!");
    }
}
