package lesson18;

import java.util.Arrays;

public class Bank {
    private String name;
    private Account[] accounts = new Account[0];

    public Bank(String name) {
        this.name = name;
    }

    public void addAccount(Account acc) throws DuplicateAccountException {
        if (this.accountExists(acc)) {
            throw new DuplicateAccountException("Account already exists");
        } else {
            if (this.accountExists(null)) {
                for(int i = 0; i < this.accounts.length; ++i) {
                    if (this.accounts[i] == null) {
                        this.accounts[i] = acc;
                    }
                }
            } else {
                this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
                this.accounts[this.accounts.length - 1] = acc;
            }

        }
    }

    public boolean accountExists(Account acc) {
        Account[] var2 = this.accounts;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Account a = var2[var4];
            if (a.equals(acc)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        String acnts = "";
        Account[] var2 = this.accounts;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Account a = var2[var4];
            acnts = acnts + a + "\n";
        }

        return String.format("%s\n%s", this.name, acnts);
    }
}