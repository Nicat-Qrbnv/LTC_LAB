package lesson17.task2;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String p1 = "passwor";
        String p2 = "password";
        String p3 = "password3";
        String p4 = "password 4";
        String p5 = "password_5";
        String p6 = "PASSWORD_6";
        String p7 = "Password_7";

        try {
            PasswordChecker.validatePassword(p1);
        } catch (InvalidPassword var15) {
            System.out.println(var15.getMessage());
        }

        try {
            PasswordChecker.validatePassword(p2);
        } catch (InvalidPassword var14) {
            System.out.println(var14.getMessage());
        }

        try {
            PasswordChecker.validatePassword(p3);
        } catch (InvalidPassword var13) {
            System.out.println(var13.getMessage());
        }

        try {
            PasswordChecker.validatePassword(p4);
        } catch (InvalidPassword var12) {
            System.out.println(var12.getMessage());
        }

        try {
            PasswordChecker.validatePassword(p5);
        } catch (InvalidPassword var11) {
            System.out.println(var11.getMessage());
        }

        try {
            PasswordChecker.validatePassword(p6);
        } catch (InvalidPassword var10) {
            System.out.println(var10.getMessage());
        }

        try {
            PasswordChecker.validatePassword(p7);
        } catch (InvalidPassword var9) {
            System.out.println(var9.getMessage());
        }

    }
}
