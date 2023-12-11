package a1.lesson14.normal.task4;

public class StringUtil {
    public static void concatStr (String s1, String s2) {
        System.out.println (s1.concat(s2));
    }

    public static void concatStr (String s1, String s2, String s3) {
        System.out.println (s1.concat(s2).concat(s3));
    }

    public static void caseStrLetters (String s, boolean all) {
        if (all) {
            System.out.println (s.toUpperCase());
        } else {
            System.out.println (s.substring(0, 1).toUpperCase() + s.substring(1));
        }
    }

    public static void caseStrLetters (String s, boolean all, boolean toLowerCase) {
        if (all) {
            if (toLowerCase) {
                System.out.println(s.toLowerCase());
            } else {
                System.out.println(s.toUpperCase());
            }
        } else {
            if (toLowerCase) {
                System.out.println (s.substring(0, 1).toLowerCase() + s.substring(1));
            } else {
                System.out.println (s.substring(0, 1).toUpperCase() + s.substring(1));
            }
        }
    }
}
