package lesson16.entrtnng;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account(1, "insan1");
        Account a2 = new Account(2, "insan2");
        Account a3 = new Account(3, "insan3");
        Account a4 = new Account(1, "insan4");

        Bank YastiqAlti = new Bank("Yastıq Altı Bank");
        String existingAccounts = "Failed Account addition operations:";
        try {
            YastiqAlti.addAccount(a1);
        } catch (DuplicateAccountException e) {
            existingAccounts += "\n" + a1.getAccntHolder();
        }
        try {
            YastiqAlti.addAccount(a2);
        } catch (DuplicateAccountException e) {
            existingAccounts += "\n" + a2.getAccntHolder();
        }
        try {
            YastiqAlti.addAccount(a3);
        } catch (DuplicateAccountException e) {
            existingAccounts += "\n" + a3.getAccntHolder();
        }
        try {
            YastiqAlti.addAccount(a4);
        } catch (DuplicateAccountException e) {
            existingAccounts += "\n" + a4.getAccntHolder();
        }

        System.out.println (YastiqAlti);
        System.out.println (existingAccounts);
        System.out.println ();

        try {
            a1.depositAmount(50);
            System.out.println (a1);
        } catch (ExpectedNaturalNumberException e) {
            System.out.println (e.getMessage());
        }
        try {
            a2.depositAmount(75);
            System.out.println (a2);
        } catch (ExpectedNaturalNumberException e) {
            System.out.println (e.getMessage());
        }
        try {
            a3.depositAmount(100);
            System.out.println (a3);
        } catch (ExpectedNaturalNumberException e) {
            System.out.println (e.getMessage());
        }
        try {
            a4.depositAmount(-125);
            System.out.println (a4);
        } catch (ExpectedNaturalNumberException e) {
            System.out.println (e.getMessage());
        }

        a1.transferFunds(20, a2);
        a2.transferFunds(40, a3);
        a3.transferFunds(80, a4);
        a4.transferFunds(-20, a1);

        System.out.println (a1);
        System.out.println (a2);
        System.out.println (a3);
        System.out.println (a4);

    }
}
