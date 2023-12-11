package lesson16.entrtnng;

import java.util.Objects;

public class Account {
    private final int accntNumber;
    private final String accntHolder;
    private double balance;

    public Account(int accntNumber, String accntHolder) {
        this.accntNumber = accntNumber;
        this.accntHolder = accntHolder;
        balance = 0;
    }

    public String getAccntHolder() {
        return accntHolder;
    }

    public void depositAmount (int amount) throws ExpectedNaturalNumberException {
        if (amount >= 0) {
            balance += amount;
        } else {
            throw new ExpectedNaturalNumberException("Cannot deposite negative amount! " + amount + " is not acceptable!");
        }
    }

    public void withdrawAmount (int amount) throws InsufficientFundsException, ExpectedNaturalNumberException {
        if (amount >= 0) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                throw new InsufficientFundsException("Insufficient balance!");
            }
        } else {
            throw new ExpectedNaturalNumberException("Cannot withdraw negative amount");
        }
    }

    public void transferFunds (int amount, Account b) {
        try {
            this.withdrawAmount(amount);
            b.depositAmount(amount);
        } catch (ExpectedNaturalNumberException | InsufficientFundsException e) {
            System.out.println (e.getMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return accntNumber == account.accntNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accntNumber);
    }

    @Override
    public String toString() {
        return String.format ("[%s (Account number: %d) Balance: %.2f]", accntHolder, accntNumber, balance);
    }
}
