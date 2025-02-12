package org.thakur.lecture4.banking;

public class SavingsAccount extends BankAccount {
    SavingsAccount(final float initialBalance) {
        super(initialBalance);
    }

    @Override
    Float calculateInterest() {
        return getBalance() * SavingsAccount.getInterestRate();
    }

    public static Float getInterestRate() {
        return 0.03f;
    }
}
