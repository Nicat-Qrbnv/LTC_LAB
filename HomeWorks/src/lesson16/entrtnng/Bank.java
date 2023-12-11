package lesson16.entrtnng;

import java.util.Arrays;


public class Bank {
    private String name;
    private Account[] accounts;

    public Bank(String name) {
        accounts = new Account[0];
        this.name = name;
    }

    public void addAccount (Account acc) throws DuplicateAccountException {

        if (!accountExists(acc)) {

            if (accountExists(null)) {
                for (int i = 0; i < accounts.length; i++) {
                    if (accounts[i] == null) {
                        accounts[i] = acc;
                    }
                }
            } else {
                accounts = Arrays.copyOf(accounts, accounts.length+1);
                accounts[accounts.length-1] = acc;
            }

        } else {
            throw new DuplicateAccountException("Account already exists");
        }

    }

    public boolean accountExists (Account acc) {
        for (Account a : accounts) {
            if (a.equals(acc)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String acnts = "";
        for (Account a : accounts) {
            acnts += (a + "\n");
        }


        return String.format("""
                %s
                %s""", name, acnts);
    }
}
