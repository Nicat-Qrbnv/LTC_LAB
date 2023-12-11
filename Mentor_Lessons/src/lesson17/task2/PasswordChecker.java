package lesson17.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PasswordChecker {
    public PasswordChecker() {
    }

    public static void validatePassword(String s) throws InvalidPassword {

        boolean hasNumber = checkNumbers(s);
        boolean hasUpperCase = checkCase(s, false);
        boolean hasLowerCase = checkCase(s, true);
        boolean hasValidSpclChar = checkValidSpclChars(s);

        System.out.println(s);

        if (s.length() <= 7) {
            throw new InvalidPassword("✕ Password length: ⩽ 8!\n");

        } else {
            System.out.println("✓ Password length: ⩾ 8.  ");

            if (!hasLowerCase && !hasUpperCase) {
                System.out.println("Password should contain at least 2 characters: one upper, one lower case!");

            } else {

                if (hasLowerCase) {
                    System.out.println("✓ Has lower case letter.");
                } else {
                    System.out.println("✕ Has lower case letter!");
                }

                if (hasUpperCase) {
                    System.out.println("✓ Has upper case letter.");
                } else {
                    System.out.println("✕ Has upper case letter!");
                }

            }

            if (hasNumber) {
                System.out.println("✓ Has number.");
            } else {
                System.out.println("✕ Has number!");
            }

            if (hasValidSpclChar) {
                System.out.println("✓ Has valid character (!, ?, %, @, -, _).");
            } else {
                System.out.println("✕ Has valid character (!, ?, %, @, -, _).");
            }

            System.out.println();
        }
    }

    public static boolean checkNumbers(String s) {

        char[] pw = s.toCharArray();
        int len = pw.length;

        for (int i = 0; i < len; ++i) {

            char c = pw[i];

            if (Character.isDigit(c)) {
                return true;
            }

        }

        return false;
    }

    public static boolean checkCase(String s, boolean lower) {
        if (!s.toLowerCase().equals(s) && !s.toUpperCase().equals(s)) {
            return !s.toLowerCase().equals(s.toUpperCase());
        } else {
            return lower ? s.toLowerCase().equals(s) : s.toUpperCase().equals(s);
        }
    }

    public static boolean checkValidSpclChars(String s) {

        char[] stringToChar = s.toCharArray();
        HashSet<Character> spclChar = new HashSet<>();

        for (char c : stringToChar) {

            if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
                spclChar.add(c);
            }

        }

        HashSet<Character> validChars = new HashSet<>(List.of('!', '%', '-', '_', '@', '?'));
        boolean isValid = false;

        if (!spclChar.isEmpty()) {

            for (char sc : spclChar) {
                isValid = validChars.contains(sc);

                if (!isValid) {
                    break;
                }
            }
        }

        return isValid;
    }
}