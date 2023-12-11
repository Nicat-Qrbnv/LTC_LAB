package lesson18;

import java.util.Objects;

public class Account {
    private final int accntNumber;
    private final String accntHolder;
    private double balance;

    public Account(int accntNumber, String accntHolder) {
        this.accntNumber = accntNumber;
        this.accntHolder = accntHolder;
        this.balance = 0.0;
    }

    public String getAccntHolder() {
        return this.accntHolder;
    }

    public void depositAmount(int amount) throws ExpectedNaturalNumberException {
        if (amount >= 0) {
            this.balance += (double)amount;
        } else {
            throw new ExpectedNaturalNumberException("Cannot deposite negative amount! " + amount + " is not acceptable!");
        }
    }

    public void withdrawAmount(int amount) throws InsufficientFundsException, ExpectedNaturalNumberException {
        if (amount >= 0) {
            if ((double)amount <= this.balance) {
                this.balance -= (double)amount;
            } else {
                throw new InsufficientFundsException("Insufficient balance!");
            }
        } else {
            throw new ExpectedNaturalNumberException("Cannot withdraw negative amount");
        }
    }

    public void transferFunds(int amount, Account b) {
        try {
            this.withdrawAmount(amount);
            b.depositAmount(amount);
        } catch (InsufficientFundsException | ExpectedNaturalNumberException var4) {
            System.out.println(var4.getMessage());
        }

    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof Account) {
            Account account = (Account)o;
            return this.accntNumber == account.accntNumber;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.accntNumber});
    }

    public String toString() {
        return String.format("[%s (Account number: %d) Balance: %.2f]", this.accntHolder, this.accntNumber, this.balance);
    }
}