package lesson19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Month jan = Month.JAN;
        Month jul = Month.JUL;

        jan.printMonth();
        jul.printMonth();



        String input = "123";
        int num = Integer.parseInt(input);
        int num2 = 2 * num;
        System.out.println ("The double of the number: " + num2);



        short num3 = 256;
        Short num3Boxed = num3;
        short num4 = Short.reverseBytes(num3Boxed);
        System.out.println ("Reverse of bytes of " + num3 + " : " + num4);



        String inputString = "Sun is shining and the Sky is blue.";

        Pattern pattern = Pattern.compile("\\b[Ss]\\w*\\b");
        Matcher matcher = pattern.matcher(inputString);

        while (matcher.find()) {
            String matchedWord = matcher.group();
            System.out.println (matchedWord);
        }
    }
}
